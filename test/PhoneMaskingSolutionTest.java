import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneMaskingSolutionTest {
    PhoneMaskingSolution phoneMaskingSolution = new PhoneMaskingSolution();

    @Test
    void solution() throws Exception {
        assertEquals(phoneMaskingSolution.solution("01012345678"), "*******5678");
    }

    @Test
    void checkPhoneNumberLength() {
        assertEquals(phoneMaskingSolution.checkPhoneNumberLength("01012345678"), true);
    }

    @Test
    void replacePhoneNumber() {
        assertEquals(phoneMaskingSolution.replacePhoneNumber("01012345678"), "*******5678");
    }
}