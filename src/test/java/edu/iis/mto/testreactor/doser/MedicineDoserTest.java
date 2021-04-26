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
    void catchInsufficientMedicineExceptionWhenRecipeNumberGreaterThanMedicinePackageCapacity() {
        fail("unimplemented");
    }
    @Test
    void catchErrorIfMedicinePackageIsNull() {
        fail("unimplemented");
    }
    @Test
    void catchErrorIfInfuserIsNull() {
        fail("unimplemented");
    }
    @Test
    void catchErrorIfDosageLogIsNull() {
        fail("unimplemented");
    }
    @Test
    void catchErrorIfClockIsNull() {
        fail("unimplemented");
    }

    @Test
    void catchNullPointerExceptionWhenMedicineNullInAddMethod() {
        fail("unimplemented");
    }
    @Test
    void sucessIfRecipeNumberEqualsZero() {
        fail("unimplemented");
    }
    @Test
    void sucessIfRecipeNumberLessThanZero() {
        fail("unimplemented");
    }
    @Test
    void sucessWhenDoseLogEnd() {
        fail("unimplemented");
    }

    @Test
    void falseWhenMedicineNotEquals() {
        fail("unimplemented");
    }


}
