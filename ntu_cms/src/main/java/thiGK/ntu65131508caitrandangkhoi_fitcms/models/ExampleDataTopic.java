package thiGK.ntu65131508caitrandangkhoi_fitcms.models;

import java.util.ArrayList;
import java.util.List;

public class ExampleDataTopic {
    
    public static List<Topic> topics = new ArrayList<>();

    
    static {
        topics.add(new Topic("T01", "Website Bán Hàng", "Phát triển web E-commerce", "GV01", "Web"));
        topics.add(new Topic("T02", "App Quản Lý Sinh Viên", "Viết ứng dụng Android", "GV02", "Mobile"));
        topics.add(new Topic("T03", "AI Nhận Diện Khuôn Mặt", "Nghiên cứu Machine Learning", "GV03", "AI"));
    }
}