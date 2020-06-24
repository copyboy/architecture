package com.deepj.architecture.chapter01;

import com.deepj.architecture.common.LangEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-23-22:38
 */
class Chapter01_2_1Test {

    @Test
    void switchStrCase_when_given_match() {
        String job = Chapter01_2_1.switchStrCase("job");
        assertSame("I'm job, I'm a student.", job);
    }

    @Test
    void switchStrCase_when_given_not_match() {
        String steven = Chapter01_2_1.switchStrCase("steven");
        assertSame("Hi, welcome to deepj's tutorial blog. ", steven);
    }

    @Test
    void switchEnumCase_when_given_match() {
        String langLabel = Chapter01_2_1.switchEnumCase(LangEnum.PHP);
        assertSame("PHP is the best.", langLabel);
    }

    @Test
    void switchEnumCase_when_given_not_match() {
        String langLabel = Chapter01_2_1.switchEnumCase(LangEnum.GO);
        assertSame("Talk is cheap, show me the code.", langLabel);
    }

    @Test
    void switchIntCase_match_when_given_char() {
        String caseWhen = Chapter01_2_1.switchIntCase('A');
        assertSame("char case in int switch.", caseWhen);
    }

    @Test
    void switchIntCase_match_when_given_byte() {
        byte b = 127;
        String caseWhen = Chapter01_2_1.switchIntCase(b);
        assertSame("byte case in int switch.", caseWhen);
    }

    @Test
    void switchIntCase_match_when_given_short() {
        short b = 32767;
        String caseWhen = Chapter01_2_1.switchIntCase(b);
        assertSame("short case in int switch.", caseWhen);
    }

    @Test
    void switchIntCase_match_when_given_int() {
        int b = 0x7fffffff;
        String caseWhen = Chapter01_2_1.switchIntCase(b);
        assertSame("int case in int switch.", caseWhen);
    }

    @Test
    void switchIntCase_not_match_when_given_int() {
        int b = 128;
        String caseWhen = Chapter01_2_1.switchIntCase(b);
        assertSame("deepj's. int case default.", caseWhen);
    }
}