import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneMaskingSolutionTest {

    @Test
    void solution() throws Exception {
        PhoneMaskingSolution phoneMaskingSolution = new PhoneMaskingSolution();
        assertEquals(phoneMaskingSolution.solution("01012345678"), "*******5678");
    }

    @Test
    void checkPhoneNumberLength() {
        PhoneMaskingSolution phoneMaskingSolution = new PhoneMaskingSolution();
        assertEquals(phoneMaskingSolution.checkPhoneNumberLength("01012345678"), true);
    }

    @Test
    void replacePhoneNumber() {
        PhoneMaskingSolution phoneMaskingSolution = new PhoneMaskingSolution();
        assertEquals(phoneMaskingSolution.replacePhoneNumber("01012345678"), "*******5678");
    }
}