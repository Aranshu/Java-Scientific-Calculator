package Calculator;
import java.awt.Font;
/**
 *
 * @author ABC
 */
public class HomeIndex {
public static void main(String[] args) {
        LoadingPage Splash=new LoadingPage();
        Splash.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
        Splash.setVisible(true);
        HomePage sc=new HomePage();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                Splash.loadingnum.setText(Integer.toString(i)+"%");
                Splash.loadingbar.setValue(i);
                if (i==100)
                {
                	sc.setLocationRelativeTo(null);
                	sc.setVisible(true);
                    Splash.setVisible(false);
                }
            }
            
        }catch(Exception e){
            
        }
    }
    
}


