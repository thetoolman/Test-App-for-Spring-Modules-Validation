////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2009, Suncorp Metway Limited. All rights reserved.
//
// This is unpublished proprietary source code of Suncorp Metway Limited.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////
package nz.co.vero.test.bean;

import java.lang.reflect.Field;
import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.CascadeValidation;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ConditionRef;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Email;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Expression;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Expressions;
import org.springmodules.validation.bean.conf.loader.annotation.handler.InTheFuture;
import org.springmodules.validation.bean.conf.loader.annotation.handler.InThePast;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Length;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Max;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxSize;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Min;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MinLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MinSize;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotEmpty;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Range;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Size;

public class TestBean {

    @CascadeValidation
    private String testCascade = "cascade";

    @ConditionRef(value = "", message = "fail")
    private String testConditionRef = "condition ref";

    @Email(message = "fail")
    private String testEmail = "condition ref";

    @Expression(value = "", message = "fail")
    private String testExpression = "rar";

    @Expressions(value = { @Expression(value = "") })
    private String testExpressions = "rarS";

    @InTheFuture(message = "fail")
    private Date testInFuture = new Date();

    @InThePast(message = "fail")
    private Date testInPast = new Date();

    @Length(min = 1, max = 5, message = "fail")
    private String testLength = null;

    @Max(value = 10, message = "Shouldnt be > 10")
    private Integer testMax = 5;

    @MaxLength(value = 10, message = "Shouldnt be length > 10")
    private Integer testMaxLength = 5;

    @MaxSize(value = 1, message = "Shouldnt be size > 1")
    private String[] testMaxSize = { "1", "2" };

    @Min(value = 20, message = "Shouldnt be < 20")
    private Integer testMin = 5;

    @MinLength(value = 20, message = "Shouldnt be length < 20")
    private Integer testMinLength = 5;

    @MinSize(value = 20, message = "Shouldnt be size < 20")
    private Integer testMinSize = 5;

    @NotBlank(message = "Shouldnt be blank")
    private String testBlank = "not blank";

    @NotEmpty(message = "Shouldnt be empty")
    private String testEmpty = "not empty";

    @NotNull(message = "Shouldnt be null")
    private String testNull = null;

    @Range(message = "Should be 2-10 range", max = 10, min = 2)
    private String testRange = null;

    @RegExp(message = "only lower case a-z allowed", value = "[a-z]*")
    private String testRegExp = "FAIL";

    @Size(message = "Should be size 2-10", max = 2, min = 10)
    private String testSize = null;

    /*
     * Utility to help render the fields out in JSP :)
     */
    public Field[] getFields() {
        return this.getClass().getDeclaredFields();
    }

    // GETTERS SETTERS

    public String getTestNull() {
        return testNull;
    }

    public String getTestExpression() {
        return testExpression;
    }

    public void setTestExpression(String testExpression) {
        this.testExpression = testExpression;
    }

    public String getTestExpressions() {
        return testExpressions;
    }

    public void setTestExpressions(String testExpressions) {
        this.testExpressions = testExpressions;
    }

    public Date getTestInFuture() {
        return testInFuture;
    }

    public void setTestInFuture(Date testInFuture) {
        this.testInFuture = testInFuture;
    }

    public Date getTestInPast() {
        return testInPast;
    }

    public void setTestInPast(Date testInPast) {
        this.testInPast = testInPast;
    }

    public String getTestLength() {
        return testLength;
    }

    public void setTestLength(String testLength) {
        this.testLength = testLength;
    }

    public Integer getTestMaxLength() {
        return testMaxLength;
    }

    public void setTestMaxLength(Integer testMaxLength) {
        this.testMaxLength = testMaxLength;
    }

    public String[] getTestMaxSize() {
        return testMaxSize;
    }

    public void setTestMaxSize(String[] testMaxSize) {
        this.testMaxSize = testMaxSize;
    }

    public Integer getTestMin() {
        return testMin;
    }

    public void setTestMin(Integer testMin) {
        this.testMin = testMin;
    }

    public Integer getTestMinLength() {
        return testMinLength;
    }

    public void setTestMinLength(Integer testMinLength) {
        this.testMinLength = testMinLength;
    }

    public Integer getTestMinSize() {
        return testMinSize;
    }

    public void setTestMinSize(Integer testMinSize) {
        this.testMinSize = testMinSize;
    }

    public String getTestEmpty() {
        return testEmpty;
    }

    public void setTestEmpty(String testEmpty) {
        this.testEmpty = testEmpty;
    }

    public String getTestRange() {
        return testRange;
    }

    public void setTestRange(String testRange) {
        this.testRange = testRange;
    }

    public String getTestRegExp() {
        return testRegExp;
    }

    public void setTestRegExp(String testRegExp) {
        this.testRegExp = testRegExp;
    }

    public String getTestSize() {
        return testSize;
    }

    public void setTestSize(String testSize) {
        this.testSize = testSize;
    }

    public void setTestNull(String testNull) {
        this.testNull = testNull;
    }

    public String getTestBlank() {
        return testBlank;
    }

    public void setTestBlank(String testBlank) {
        this.testBlank = testBlank;
    }

    public Integer getTestMax() {
        return testMax;
    }

    public void setTestMax(Integer testMax) {
        this.testMax = testMax;
    }

    public String getTestCascade() {
        return testCascade;
    }

    public void setTestCascade(String testCascade) {
        this.testCascade = testCascade;
    }

    public String getTestConditionRef() {
        return testConditionRef;
    }

    public void setTestConditionRef(String testConditionRef) {
        this.testConditionRef = testConditionRef;
    }

    public String getTestEmail() {
        return testEmail;
    }

    public void setTestEmail(String testEmail) {
        this.testEmail = testEmail;
    }
}
