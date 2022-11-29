public class 判断元音还是辅音 {
    public static void main(String[] args) {

        //随机生成a-z的字母。如果是a、e、i、o、u，则输出“元音”，否则“辅音”
        int num = (int)(Math.random()*26);
        char zimu ='a';
        zimu = (char)(zimu+num);
        if(zimu=='a'||zimu=='e'||zimu=='i'||zimu=='o'||zimu=='u') {
            System.out.println("元音:" + zimu);
        }else{
            System.out.println("辅音："+zimu);
        }
    }
}
