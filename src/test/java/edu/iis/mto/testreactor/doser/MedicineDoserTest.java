package edu.iis.mto.testreactor.doser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MedicineDoserTest {

    @Test
    void itCompiles() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void catchExcpetionWhenDosageLogDifuserError() {
        fail("unimplemented");
    }

    @Test
    void testIfRecipeNumberLessThanZero() {
        fail("unimplemented");
    }
    @Test
    void testIfRecipeNumberEqualsZero() {
        fail("unimplemented");
    }
}
