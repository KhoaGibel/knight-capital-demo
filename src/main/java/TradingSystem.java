public class TradingSystem {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static void main(String[] args) {
        System.out.println("Hệ thống SMARS bắt đầu hoạt động...");
        
        // Giả lập server cũ nhận Flag=1 
        // (Nhẽ ra là lệnh mới nhưng code cũ hiểu là Power Peg)
        int receivedFlag = 1; 
        executeOrder(receivedFlag);
    }
    
    public static void executeOrder(int flag) {
        // ĐÂY CHÍNH LÀ QUẢ BOM: LỖI LOGIC DÙNG MAGIC NUMBER
        if (flag == 1) {
            // !!! CẢNH BÁO: KÍCH HOẠT HÀM 'XÁC SỐNG' ĐÁNG LẼ PHẢI XÓA TỪ 8 NĂM TRƯỚC !!!
            activatePowerPegMode(); 
        }
    }
    
    // --- ĐÂY LÀ HÀM 'NGUY HIỂM' ---
    private static void activatePowerPegMode() {
        int orders = 0;
        // Vòng lặp while(true) gửi lệnh liên tục mà không có điểm dừng, 
        // chính là nguyên nhân gây thảm họa sập sàn của Knight Capital.
        while (true) {
            orders++;
            // In ra log giả lập gửi lệnh mua
            System.out.println(ANSI_RED + "[CRITICAL] Power Peg Active: Mua co phieu lenh thu " + orders + ANSI_RESET);
            
            // Dừng giả lập sau 1000 lệnh để tránh treo máy Khoa
            if (orders > 1000) break; 
        }
    }
    private static void activatePowerPegMode() {
    System.out.println("Hàm này sẽ gây ra lỗi Knight Capital!");
}
}