package khoi.thSrpingBoot.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class B4_BMICalculator {

    
    @GetMapping("/bai4")
    public String hienThiFormBMI() {
        return "bmi-form"; 
    }

    
    @PostMapping("/tinh-bmi")
    public String tinhToanBMI(
            
            @RequestParam("chieucao") double chieuCao,
            @RequestParam("cannang") double canNang,
            Model model) {

        
        double bmi = canNang / (chieuCao * chieuCao);
        String phanLoai = "";
        String mauSac = "";

        
        if (bmi < 18.5) {
            phanLoai = "Gầy - Cần bổ sung dinh dưỡng!";
            mauSac = "#f39c12"; 
        } else if (bmi < 22.9) {
            phanLoai = "Bình thường - Duy trì phong độ nhé!";
            mauSac = "#27ae60"; 
        } else if (bmi < 24.9) {
            phanLoai = "Thừa cân - Nên chú ý ăn uống!";
            mauSac = "#e67e22"; 
        } else {
            phanLoai = "Béo phì - Cần tập luyện giảm cân!";
            mauSac = "#c0392b"; 
        }

        
        model.addAttribute("chiSoBMI", String.format("%.2f", bmi));
        model.addAttribute("phanLoai", phanLoai);
        model.addAttribute("mauSac", mauSac);

        return "bmi-result"; 
    }
}
