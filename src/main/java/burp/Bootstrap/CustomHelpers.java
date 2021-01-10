package burp.Bootstrap;

import java.util.Date;
import java.util.Random;

public class CustomHelpers {
    /**
     * ��ȡ��ȷ�����ʱ���
     * @param date
     * @return int
     */
    public static int getSecondTimestamp(Date date){
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime()/1000);
        return Integer.valueOf(timestamp);
    }

    /**
     * ���ȡ���ɸ��ַ�
     * @param number
     * @return
     */
    public static String randomStr(int number) {
        StringBuffer s = new StringBuffer();
        char[] stringArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9'};
        Random random = new Random();
        for (int i = 0; i < number; i++){
            char num = stringArray[random.nextInt(stringArray.length)];
            s.append(num);
        }
        return s.toString();
    }

}