package week_02;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * RC4 (Rivest Cipher 4).
 * Thuật toán mã dòng (Stream Cipher).
 * Chỉ sử dụng cho mục đích học tập, không dùng trong ứng dụng thực tế.
 */
public final class RC4Cipher {

    private RC4Cipher() {
    }

    /**
     * Kiểm tra khóa.
     */
    private static byte[] validateKey(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Khóa RC4 không được để trống.");
        }

        return key.getBytes(StandardCharsets.UTF_8);
    }

    /**
     * Thuật toán RC4.
     */
    private static byte[] rc4(byte[] input, byte[] key) {
        int[] S = new int[256];

        // Khởi tạo mảng trạng thái
        for (int i = 0; i < 256; i++) {
            S[i] = i;
        }

        // Key Scheduling Algorithm (KSA)
        int j = 0;

        for (int i = 0; i < 256; i++) {
            j = (j + S[i] + (key[i % key.length] & 0xFF)) % 256;

            int temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }

        // Pseudo-Random Generation Algorithm (PRGA)
        byte[] output = new byte[input.length];

        int i = 0;
        j = 0;

        for (int n = 0; n < input.length; n++) {
            i = (i + 1) % 256;
            j = (j + S[i]) % 256;

            int temp = S[i];
            S[i] = S[j];
            S[j] = temp;

            int k = S[(S[i] + S[j]) % 256];

            output[n] = (byte) (input[n] ^ k);
        }

        return output;
    }

    /**
     * Mã hóa văn bản thành chuỗi Base64.
     */
    public static String encrypt(String plaintext, String key) {
        byte[] keyBytes = validateKey(key);
        byte[] input = plaintext.getBytes(StandardCharsets.UTF_8);

        byte[] encrypted = rc4(input, keyBytes);

        return Base64.getEncoder().encodeToString(encrypted);
    }

    /**
     * Giải mã chuỗi Base64 thành văn bản.
     */
    public static String decrypt(String ciphertext, String key) {
        byte[] keyBytes = validateKey(key);

        byte[] input;

        try {
            input = Base64.getDecoder().decode(ciphertext);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Ciphertext không hợp lệ.");
        }

        byte[] decrypted = rc4(input, keyBytes);

        return new String(decrypted, StandardCharsets.UTF_8);
    }
}