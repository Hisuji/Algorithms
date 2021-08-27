public class PhoneMaskingSolution {
    public String solution(String phone_number) throws Exception{
        String answer = "";
        if (checkPhoneNumberLength(phone_number) == true) {
            answer = replacePhoneNumber(phone_number);
        } else {
            throw new Exception();
        }
        return answer;
    }

    // 제한조건 : 길이 4이상, 20이하인 문자열
    public boolean checkPhoneNumberLength(String phone_number) {
        return phone_number.length() >= 4 && phone_number.length() <= 20;
    }

    // *로 마스킹하는 함수
    public String replacePhoneNumber(String phone_number) {
        String noChangeNumber = phone_number.substring(phone_number.length() - 4);
        String changeNumber = phone_number.substring(0, phone_number.length() - 4);
        String maskingNumber = changeNumber.replaceAll("[0-9]", "*");
        String result = maskingNumber.concat(noChangeNumber);
        return result;
    }
}
