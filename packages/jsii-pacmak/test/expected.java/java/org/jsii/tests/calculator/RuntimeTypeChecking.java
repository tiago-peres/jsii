package org.jsii.tests.calculator;
@org.jsii.Jsii(module = org.jsii.tests.calculator.$Module.class, fqn = "jsii$jsii_calc$.RuntimeTypeChecking")
public class RuntimeTypeChecking extends org.jsii.JsiiObject {
    protected RuntimeTypeChecking(final org.jsii.JsiiObject.InitializationMode mode) {
        super(mode);
    }
    public RuntimeTypeChecking() {
        super(org.jsii.JsiiObject.InitializationMode.Jsii);
        org.jsii.JsiiEngine.getInstance().createNewObject(this);
    }
    /**
     * Used to verify verification of number of method arguments.
     */
    public void methodWithOptionalArguments(final java.lang.Number arg1, final java.lang.String arg2, final java.time.Instant arg3) {
        this.jsiiCall("methodWithOptionalArguments", Void.class, java.util.stream.Stream.concat(java.util.stream.Stream.concat(java.util.stream.Stream.of(arg1), java.util.stream.Stream.of(arg2)), java.util.stream.Stream.of(arg3)).toArray());
    }
    /**
     * Used to verify verification of number of method arguments.
     */
    public void methodWithOptionalArguments(final java.lang.Number arg1, final java.lang.String arg2) {
        this.jsiiCall("methodWithOptionalArguments", Void.class, java.util.stream.Stream.concat(java.util.stream.Stream.of(arg1), java.util.stream.Stream.of(arg2)).toArray());
    }
}