/*
 * Decompiled with CFR 0.152.
 */
package r.d3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleProxies;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class C1a946c5246ca0949bfd0e13d {
    private static volatile /* synthetic */ int loadState;
    private static volatile /* synthetic */ String loadMessage;
    private static volatile /* synthetic */ boolean diversifiedVmEnabled;
    private static volatile /* synthetic */ String vmSelfCheck;
    private static volatile /* synthetic */ long nativeBootToken;
    private static volatile /* synthetic */ boolean nativeSelfCheckFailed;
    private static volatile /* synthetic */ boolean sealedNativeBindingsPublished;
    private static final /* synthetic */ String SEALED_NATIVE_INDEX_RESOURCE = "META-INF/2b/133bbfe49e7328/f7/e47d3c691f474c2d8feba8b79724ec.ini";
    private static final /* synthetic */ String VM_PRELOAD_INDEX_RESOURCE = "META-INF/.r/vm.idx";
    private static final /* synthetic */ String VM_CURRENT_PRELOAD_INDEX_RESOURCE = "META-INF/.r/vm-current.idx";
    private static final /* synthetic */ int RUNTIME_RESOURCE_VERSION = 6;
    private static final /* synthetic */ int LEGACY_RUNTIME_RESOURCE_VERSION = 5;
    private static final /* synthetic */ int BOOTSTRAP_NATIVE_INDEX_VERSION = 1;
    private static final /* synthetic */ int ZSTD_MAGIC = -47205080;
    private static final /* synthetic */ ConcurrentMap<String, Object[]> SAM_LAMBDA_CACHE;

    private C1a946c5246ca0949bfd0e13d() {
    }

    static native /* synthetic */ int m_f5c3faf913dbeb34(String var0);

    static native /* synthetic */ int m_d4fbb88807b6e388(byte[] var0, byte[] var1);

    static native /* synthetic */ int m_da032585fedce091();

    static native /* synthetic */ String m_8389b6b6f5897173();

    static native /* synthetic */ long m_1d0acd678a40ef69();

    static native /* synthetic */ void m_9c3b728463d0474b(byte[] var0);

    static native /* synthetic */ void m_3bafbf4999d2f699();

    public static native /* synthetic */ byte[] m_5bb2a0cc9d04e8e9(byte[] var0, byte[] var1, byte[] var2);

    public static native /* synthetic */ byte[] nativeDeriveClassEncryptionKey(byte[] var0, byte[] var1, int var2);

    public static native /* synthetic */ Object m_70c35f2a11b0591c(long var0, String var2, Object[] var3);

    public static native /* synthetic */ Object m_a3e097fc18eeb409(long var0, Object[] var2);

    public static /* synthetic */ Object m_4a33a5361cd07654(long l2, String string, Object[] objectArray) {
        if (0 != 0) {
        }
        if (loadState == 0) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("vm", "auto", "vm-diverse");
        }
        if (C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.ensureSealedNativeBindingsPublished();
            return C1a946c5246ca0949bfd0e13d.m_70c35f2a11b0591c(l2, string, objectArray);
        }
        throw new SecurityException("method-virtualization requires a bundled sealed JNI VM kernel; native kernel not loaded (" + loadMessage + ")");
    }

    public static /* synthetic */ Object m_7dd473f102f12607(long l2, Object[] objectArray) {
        if (0 != 0) {
        }
        if (loadState == 0) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("vm", "auto", "vm-diverse");
        }
        if (C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.ensureSealedNativeBindingsPublished();
            return C1a946c5246ca0949bfd0e13d.m_a3e097fc18eeb409(l2, objectArray);
        }
        throw new SecurityException("method-virtualization requires a bundled sealed JNI VM kernel; native kernel not loaded (" + loadMessage + ")");
    }

    public static native /* synthetic */ void m_a1bffddd2595ba11(long var0);

    public static native /* synthetic */ int m_5041c41b4950922c(long var0);

    public static native /* synthetic */ int m_36808bdee5366157(long var0, int var2);

    public static native /* synthetic */ void m_9397ab60ed8696e0(long var0, int var2);

    public static /* synthetic */ void m_626dfb83e7434b7e(long l2) {
        if (0 != 0) {
        }
        if (loadState == 0) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("vm", "auto", "vm-diverse");
        }
        if (C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.ensureSealedNativeBindingsPublished();
            C1a946c5246ca0949bfd0e13d.m_a1bffddd2595ba11(l2);
            return;
        }
        throw new SecurityException("method-virtualization requires a bundled sealed JNI VM kernel; native kernel not loaded (" + loadMessage + ")");
    }

    public static /* synthetic */ int m_39c395a59fb88f58(long l2) {
        if (0 != 0) {
        }
        if (loadState == 0) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("vm", "auto", "vm-diverse");
        }
        if (C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.ensureSealedNativeBindingsPublished();
            return C1a946c5246ca0949bfd0e13d.m_5041c41b4950922c(l2);
        }
        throw new SecurityException("method-virtualization requires a bundled sealed JNI VM kernel; native kernel not loaded (" + loadMessage + ")");
    }

    public static /* synthetic */ int m_2df66a83a336457b(long l2, int n) {
        if (0 != 0) {
        }
        if (loadState == 0) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("vm", "auto", "vm-diverse");
        }
        if (C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.ensureSealedNativeBindingsPublished();
            return C1a946c5246ca0949bfd0e13d.m_36808bdee5366157(l2, n);
        }
        throw new SecurityException("method-virtualization requires a bundled sealed JNI VM kernel; native kernel not loaded (" + loadMessage + ")");
    }

    public static /* synthetic */ void m_fc86d48ad5bcfd94(long l2, int n) {
        if (0 != 0) {
        }
        if (loadState == 0) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("vm", "auto", "vm-diverse");
        }
        if (C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.ensureSealedNativeBindingsPublished();
            C1a946c5246ca0949bfd0e13d.m_9397ab60ed8696e0(l2, n);
            return;
        }
        throw new SecurityException("method-virtualization requires a bundled sealed JNI VM kernel; native kernel not loaded (" + loadMessage + ")");
    }

    public static /* synthetic */ Runnable createRunnableLambda(String string, String string2, String string3, int n, Object[] objectArray) {
        if (0 != 0) {
        }
        return (Runnable)C1a946c5246ca0949bfd0e13d.createSamLambda("run", "()Ljava/lang/Runnable;", string, string2, string3, n, objectArray);
    }

    public static /* synthetic */ Object createSamLambda(String string, String string2, String string3, String string4, String string5, int n, Object[] objectArray) {
        if (0 != 0) {
        }
        Object[] objectArray2 = objectArray == null ? new Object[]{} : Arrays.copyOf(objectArray, objectArray.length);
        Object[] objectArray3 = C1a946c5246ca0949bfd0e13d.resolveSamLambdaTarget(string3, string4, string5, n);
        String string6 = C1a946c5246ca0949bfd0e13d.descriptorReturnInternalName(string2);
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            if ("java/lang/Runnable".equals(string6) && "run".equals(string)) {
                MethodHandle methodHandle = lookup.findStatic(C1a946c5246ca0949bfd0e13d.class, "runSamLambda", MethodType.methodType(Void.TYPE, Object[].class, Object[].class));
                return MethodHandleProxies.asInterfaceInstance(Runnable.class, MethodHandles.insertArguments(methodHandle, 0, objectArray3, objectArray2));
            }
            if ("java/util/function/IntUnaryOperator".equals(string6) && "applyAsInt".equals(string)) {
                MethodHandle methodHandle = lookup.findStatic(C1a946c5246ca0949bfd0e13d.class, "applyAsIntSamLambda", MethodType.methodType(Integer.TYPE, Object[].class, Object[].class, Integer.TYPE));
                return MethodHandleProxies.asInterfaceInstance(IntUnaryOperator.class, MethodHandles.insertArguments(methodHandle, 0, objectArray3, objectArray2));
            }
            if ("java/util/function/Function".equals(string6) && "apply".equals(string)) {
                MethodHandle methodHandle = lookup.findStatic(C1a946c5246ca0949bfd0e13d.class, "applySamLambda", MethodType.methodType(Object.class, Object[].class, Object[].class, Object.class));
                return MethodHandleProxies.asInterfaceInstance(Function.class, MethodHandles.insertArguments(methodHandle, 0, objectArray3, objectArray2));
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new IllegalStateException("cannot create virtualized SAM lambda", reflectiveOperationException);
        }
        throw new IllegalArgumentException("unsupported virtualized SAM lambda");
    }

    public static /* synthetic */ void runSamLambda(Object[] objectArray, Object[] objectArray2) {
        if (0 != 0) {
        }
        C1a946c5246ca0949bfd0e13d.invokeSamLambdaTarget(objectArray, objectArray2, new Object[0]);
    }

    public static /* synthetic */ int applyAsIntSamLambda(Object[] objectArray, Object[] objectArray2, int n) {
        if (0 != 0) {
        }
        Object object = C1a946c5246ca0949bfd0e13d.invokeSamLambdaTarget(objectArray, objectArray2, new Object[]{n});
        return ((Number)object).intValue();
    }

    public static /* synthetic */ Object applySamLambda(Object[] objectArray, Object[] objectArray2, Object object) {
        if (0 != 0) {
        }
        return C1a946c5246ca0949bfd0e13d.invokeSamLambdaTarget(objectArray, objectArray2, new Object[]{object});
    }

    private static /* synthetic */ Object[] resolveSamLambdaTarget(String string, String string2, String string3, int n) {
        String string4;
        Object[] objectArray;
        if (0 != 0) {
        }
        if ((objectArray = (Object[])SAM_LAMBDA_CACHE.get(string4 = string + "\u0000" + string2 + "\u0000" + string3 + "\u0000" + n)) != null) {
            return objectArray;
        }
        try {
            ClassLoader classLoader = C1a946c5246ca0949bfd0e13d.class.getClassLoader();
            Class<?> clazz = Class.forName(string.replace('/', '.'), false, classLoader);
            Class<?>[] classArray = C1a946c5246ca0949bfd0e13d.descriptorParameterTypes(string3, clazz.getClassLoader());
            String string5 = C1a946c5246ca0949bfd0e13d.resolveBoundMethodName(string, string2, string3);
            Method method = clazz.getDeclaredMethod(string5, classArray);
            method.setAccessible(true);
            boolean bl = n == 6 || Modifier.isStatic(method.getModifiers());
            Object[] objectArray2 = new Object[]{method, classArray.length, bl};
            Object[] objectArray3 = SAM_LAMBDA_CACHE.putIfAbsent(string4, objectArray2);
            return objectArray3 == null ? objectArray2 : objectArray3;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new IllegalStateException("cannot link virtualized SAM lambda", reflectiveOperationException);
        }
    }

    private static /* synthetic */ Object invokeSamLambdaTarget(Object[] objectArray, Object[] objectArray2, Object[] objectArray3) {
        int n;
        if (0 != 0) {
        }
        Object object = objectArray[0];
        int n2 = (Integer)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        Object object2 = null;
        int n3 = 0;
        if (!bl) {
            if (objectArray2.length == 0) {
                throw new IllegalStateException("missing captured lambda receiver");
            }
            object2 = objectArray2[0];
            n3 = 1;
        }
        if ((n = objectArray2.length - n3 + objectArray3.length) != n2) {
            throw new IllegalStateException("lambda argument count mismatch");
        }
        Object[] objectArray4 = new Object[n];
        System.arraycopy(objectArray2, n3, objectArray4, 0, objectArray2.length - n3);
        System.arraycopy(objectArray3, 0, objectArray4, objectArray2.length - n3, objectArray3.length);
        try {
            if (object instanceof MethodHandle) {
                Object[] objectArray5 = bl ? objectArray4 : C1a946c5246ca0949bfd0e13d.prependReceiver(object2, objectArray4);
                return ((MethodHandle)object).invokeWithArguments(objectArray5);
            }
            return ((Method)object).invoke(object2, objectArray4);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            if (throwable instanceof Error) {
                throw (Error)throwable;
            }
            throw new RuntimeException(throwable);
        }
        catch (Throwable throwable) {
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            if (throwable instanceof Error) {
                throw (Error)throwable;
            }
            throw new RuntimeException(throwable);
        }
    }

    private static /* synthetic */ Object[] prependReceiver(Object object, Object[] objectArray) {
        if (0 != 0) {
        }
        Object[] objectArray2 = new Object[objectArray.length + 1];
        objectArray2[0] = object;
        System.arraycopy(objectArray, 0, objectArray2, 1, objectArray.length);
        return objectArray2;
    }

    public static /* synthetic */ MethodHandle resolveVmMethodHandle(String string) {
        try {
            String[] stringArray;
            if (0 != 0) {
            }
            String[] stringArray2 = stringArray = string == null ? null : string.split("\\|", -1);
            if (stringArray == null || stringArray.length != 5 || !"handle".equals(stringArray[0])) {
                return null;
            }
            int n = Integer.parseInt(stringArray[1]);
            String string2 = stringArray[2];
            String string3 = C1a946c5246ca0949bfd0e13d.resolveBoundMethodName(string2, stringArray[3], stringArray[4]);
            String string4 = stringArray[4];
            ClassLoader classLoader = C1a946c5246ca0949bfd0e13d.class.getClassLoader();
            Class<?> clazz = Class.forName(string2.replace('/', '.'), false, classLoader);
            MethodType methodType = C1a946c5246ca0949bfd0e13d.descriptorMethodType(string4, clazz.getClassLoader());
            MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(clazz, MethodHandles.lookup());
            switch (n) {
                case 6: {
                    return lookup.findStatic(clazz, string3, methodType);
                }
                case 5: {
                    return lookup.findVirtual(clazz, string3, methodType);
                }
                case 7: {
                    return lookup.findSpecial(clazz, string3, methodType, clazz);
                }
                case 8: {
                    return lookup.findStatic(clazz, string3, methodType);
                }
            }
            return null;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static /* synthetic */ String descriptorReturnInternalName(String string) {
        if (0 != 0) {
        }
        int n = string.indexOf(41);
        if (string.length() <= n + 2 || string.charAt(n + 1) != 'L') {
            throw new IllegalArgumentException("invalid SAM factory descriptor");
        }
        int n2 = string.indexOf(59, n + 2);
        if (n2 < 0) {
            throw new IllegalArgumentException("invalid SAM factory descriptor");
        }
        return string.substring(n + 2, n2);
    }

    private static /* synthetic */ MethodType descriptorMethodType(String string, ClassLoader classLoader) throws ClassNotFoundException {
        if (0 != 0) {
        }
        int n = string.indexOf(41);
        if (string.length() <= n + 1) {
            throw new IllegalArgumentException("invalid method descriptor");
        }
        Class<?>[] classArray = C1a946c5246ca0949bfd0e13d.descriptorParameterTypes(string, classLoader);
        Id83932b454d8c605 id83932b454d8c605 = C1a946c5246ca0949bfd0e13d.parseDescriptorType(string, n + 1, classLoader);
        return MethodType.methodType(id83932b454d8c605.type, classArray);
    }

    private static /* synthetic */ String resolveBoundMethodName(String string, String string2, String string3) {
        String[] stringArray;
        String string4;
        if (0 != 0) {
        }
        if ((string4 = System.getProperty(C1a946c5246ca0949bfd0e13d.sealedMethodBindingPropertyName())) == null || string4.length() == 0) {
            return string2;
        }
        String string5 = C1a946c5246ca0949bfd0e13d.sealedBindingKey(string + "#" + string2 + "#" + string3) + "=";
        for (String string6 : stringArray = string4.split("\\n")) {
            String string7;
            String string8 = string6.trim();
            if (!string8.startsWith(string5) || (string7 = string8.substring(string5.length())).length() <= 0) continue;
            return string7;
        }
        return string2;
    }

    private static /* synthetic */ Class<?>[] descriptorParameterTypes(String string, ClassLoader classLoader) throws ClassNotFoundException {
        if (0 != 0) {
        }
        int n = string.indexOf(40);
        int n2 = string.indexOf(41, n + 1);
        if (n != 0 || n2 < 0) {
            throw new IllegalArgumentException("invalid method descriptor");
        }
        ArrayList arrayList = new ArrayList();
        int n3 = n + 1;
        while (n3 < n2) {
            Id83932b454d8c605 id83932b454d8c605 = C1a946c5246ca0949bfd0e13d.parseDescriptorType(string, n3, classLoader);
            arrayList.add(id83932b454d8c605.type);
            n3 = id83932b454d8c605.nextIndex;
        }
        return arrayList.toArray(new Class[0]);
    }

    private static /* synthetic */ Id83932b454d8c605 parseDescriptorType(String string, int n, ClassLoader classLoader) throws ClassNotFoundException {
        if (0 != 0) {
        }
        char c = string.charAt(n);
        switch (c) {
            case 'Z': {
                return new Id83932b454d8c605(Boolean.TYPE, n + 1);
            }
            case 'B': {
                return new Id83932b454d8c605(Byte.TYPE, n + 1);
            }
            case 'C': {
                return new Id83932b454d8c605(Character.TYPE, n + 1);
            }
            case 'S': {
                return new Id83932b454d8c605(Short.TYPE, n + 1);
            }
            case 'I': {
                return new Id83932b454d8c605(Integer.TYPE, n + 1);
            }
            case 'J': {
                return new Id83932b454d8c605(Long.TYPE, n + 1);
            }
            case 'F': {
                return new Id83932b454d8c605(Float.TYPE, n + 1);
            }
            case 'D': {
                return new Id83932b454d8c605(Double.TYPE, n + 1);
            }
            case 'L': {
                int n2 = string.indexOf(59, n);
                if (n2 < 0) {
                    throw new IllegalArgumentException("invalid object descriptor");
                }
                String string2 = string.substring(n + 1, n2).replace('/', '.');
                return new Id83932b454d8c605(Class.forName(string2, false, classLoader), n2 + 1);
            }
            case '[': {
                int n3 = n;
                while (string.charAt(n3) == '[') {
                    ++n3;
                }
                if (string.charAt(n3) == 'L' && (n3 = string.indexOf(59, n3)) < 0) {
                    throw new IllegalArgumentException("invalid array descriptor");
                }
                String string3 = string.substring(n, n3 + 1).replace('/', '.');
                return new Id83932b454d8c605(Class.forName(string3, false, classLoader), n3 + 1);
            }
        }
        throw new IllegalArgumentException("unsupported descriptor tag " + c);
    }

    public static /* synthetic */ String getLoadStatus() {
        if (0 != 0) {
        }
        return loadState == 0 && (loadMessage == null || loadMessage.length() == 0) ? "untried" : loadMessage;
    }

    public static /* synthetic */ boolean isNativeLoaded() {
        if (0 != 0) {
        }
        return loadState == 1;
    }

    public static /* synthetic */ void m_b4439ce3798438d5(String string, String string2) {
        if (0 != 0) {
        }
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5(string, string2, "vm-off");
    }

    public static /* synthetic */ void m_4487bf5f5bb3efe5(String string, String string2, String string3) {
        if (0 != 0) {
        }
        diversifiedVmEnabled = "vm-diverse".equals(string3);
        if (loadState != 0) {
            return;
        }
        try {
            String string4 = C1a946c5246ca0949bfd0e13d.detectPlatform();
            if (string4 == null) {
                loadMessage = "native-unavailable";
                C1a946c5246ca0949bfd0e13d.runDiversifiedVmSelfExercise();
                return;
            }
            if (!"auto".equals(string2) && !string2.equals(string4)) {
                return;
            }
            if (C1a946c5246ca0949bfd0e13d.tryLoadBundledNative(string4, string)) {
                C1a946c5246ca0949bfd0e13d.runDiversifiedVmSelfExercise();
                return;
            }
            if (C1a946c5246ca0949bfd0e13d.tryLoadNative(string4, string)) {
                C1a946c5246ca0949bfd0e13d.runDiversifiedVmSelfExercise();
                return;
            }
            if (loadMessage == null || loadMessage.length() == 0) {
                loadMessage = "native-unavailable";
            }
            C1a946c5246ca0949bfd0e13d.runDiversifiedVmSelfExercise();
        }
        catch (Exception exception) {
            loadMessage = C1a946c5246ca0949bfd0e13d.debugNativeLoadMessage("native-exception", exception);
        }
    }

    public static /* synthetic */ boolean isDiversifiedVmEnabled() {
        if (0 != 0) {
        }
        return diversifiedVmEnabled;
    }

    public static /* synthetic */ boolean isKernelIntegrityReady() {
        if (0 != 0) {
        }
        return loadState == 1 && !nativeSelfCheckFailed;
    }

    public static /* synthetic */ String getVmSelfCheck() {
        if (0 != 0) {
        }
        return vmSelfCheck;
    }

    private static /* synthetic */ void runDiversifiedVmSelfExercise() {
        if (0 != 0) {
        }
        if (!diversifiedVmEnabled) {
            return;
        }
        vmSelfCheck = loadState == 1 ? "native:vm-diverse:ok" : "native:vm-diverse:unavailable";
    }

    public static /* synthetic */ void requireHealthyKernel() {
        if (0 != 0) {
        }
        if (nativeSelfCheckFailed || vmSelfCheck != null && vmSelfCheck.contains("mismatch")) {
            throw new SecurityException("Kernel integrity mismatch");
        }
    }

    private static /* synthetic */ boolean verifyNativeAbiAfterLoad() {
        try {
            if (0 != 0) {
            }
            C1a946c5246ca0949bfd0e13d.m_70c35f2a11b0591c(0L, null, null);
            return true;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            loadMessage = "x_48cf023b298bb520";
            return false;
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    private static /* synthetic */ void verifyBootTokenAfterLoad() {
        try {
            long l2;
            if (0 != 0) {
            }
            long l3 = C1a946c5246ca0949bfd0e13d.computeExpectedBootToken();
            nativeBootToken = l2 = C1a946c5246ca0949bfd0e13d.m_1d0acd678a40ef69();
            if (l2 != l3) {
                nativeSelfCheckFailed = true;
                loadMessage = "native:integrity-mismatch";
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            nativeSelfCheckFailed = true;
            loadMessage = "native:abi-missing:nativeGetBootToken";
        }
        catch (Throwable throwable) {
            nativeSelfCheckFailed = true;
            loadMessage = "native:integrity-check-failed";
        }
    }

    private static /* synthetic */ long computeExpectedBootToken() {
        String string;
        if (0 != 0) {
        }
        if ((string = C1a946c5246ca0949bfd0e13d.detectPlatform()) == null) {
            string = "";
        }
        long l2 = -3750763034362895579L;
        l2 ^= 0xAD3B3ED7L;
        l2 *= 1099511628211L;
        l2 ^= 1L;
        l2 *= 1099511628211L;
        l2 ^= C1a946c5246ca0949bfd0e13d.fnv1a32(string);
        l2 *= 1099511628211L;
        l2 ^= 1L;
        return l2 *= 1099511628211L;
    }

    private static /* synthetic */ long fnv1a32(String string) {
        if (0 != 0) {
        }
        long l2 = 2166136261L;
        for (int i = 0; i < string.length(); ++i) {
            l2 ^= (long)string.charAt(i) & 0xFFL;
            l2 = l2 * 16777619L & 0xFFFFFFFFL;
        }
        return l2;
    }

    private static /* synthetic */ String sealedBindingKey(String string) {
        if (0 != 0) {
        }
        long l2 = -3750763034362895579L;
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        for (byte by : byArray) {
            l2 ^= (long)by & 0xFFL;
            l2 *= 1099511628211L;
        }
        Object object = Long.toHexString(l2);
        return ((String)object).length() >= 16 ? object : "0000000000000000".substring(((String)object).length()) + (String)object;
    }

    private static /* synthetic */ void preloadRuntimeResourcesIntoNative() {
        try {
            if (0 != 0) {
            }
            C1a946c5246ca0949bfd0e13d.verifyVmPreloadIndexBeforeNative();
            C1a946c5246ca0949bfd0e13d.m_3bafbf4999d2f699();
        }
        catch (SecurityException securityException) {
            throw securityException;
        }
        catch (Throwable throwable) {
            throw new SecurityException("VM preload failed", throwable);
        }
    }

    private static /* synthetic */ void verifyVmPreloadIndexBeforeNative() {
        String[] stringArray;
        String string;
        if (0 != 0) {
        }
        if ((string = C1a946c5246ca0949bfd0e13d.vmPreloadIndexText()) == null || string.length() == 0) {
            return;
        }
        for (String string2 : stringArray = string.split("\n")) {
            String string3;
            String[] stringArray2;
            String string4 = string2.trim();
            if (string4.length() == 0 || string4.startsWith("A|") || (stringArray2 = string4.split("\\|", -1)).length < 7 || !C1a946c5246ca0949bfd0e13d.isHex(stringArray2[0], 1, 16) || !C1a946c5246ca0949bfd0e13d.isHex(stringArray2[4], 64, 64) || !C1a946c5246ca0949bfd0e13d.isHex(stringArray2[5], 1, 8) || !C1a946c5246ca0949bfd0e13d.isHex(stringArray2[6], 16, 16) || C1a946c5246ca0949bfd0e13d.constantTimeAsciiEquals(string3 = C1a946c5246ca0949bfd0e13d.vmPreloadEntryAuthTag(stringArray2[0], stringArray2[1], stringArray2[2], stringArray2[3], stringArray2[4], stringArray2[5]), stringArray2[6])) continue;
            throw new SecurityException("invalid VM preload profile auth");
        }
    }

    private static /* synthetic */ String vmPreloadIndexText() {
        String string;
        if (0 != 0) {
        }
        return (string = C1a946c5246ca0949bfd0e13d.vmPreloadIndexText(VM_CURRENT_PRELOAD_INDEX_RESOURCE)) != null ? string : C1a946c5246ca0949bfd0e13d.vmPreloadIndexText(VM_PRELOAD_INDEX_RESOURCE);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String vmPreloadIndexText(String string) {
        try (InputStream inputStream = C1a946c5246ca0949bfd0e13d.resourceStream(string);){
            if (inputStream == null) {
                String string3 = null;
                return string3;
            }
            byte[] byArray = C1a946c5246ca0949bfd0e13d.decodeRuntimeResource(C1a946c5246ca0949bfd0e13d.readAll(inputStream), true);
            if (byArray == null) {
                throw new SecurityException("invalid VM preload index resource");
            }
            String string2 = C1a946c5246ca0949bfd0e13d.decodeMaskedNativeIndexText(new String(byArray, StandardCharsets.UTF_8));
            return string2;
        }
        catch (SecurityException securityException) {
            throw securityException;
        }
        catch (Exception exception) {
            throw new SecurityException("invalid VM preload index resource", exception);
        }
    }

    private static /* synthetic */ String vmPreloadEntryAuthTag(String string, String string2, String string3, String string4, String string5, String string6) {
        if (0 != 0) {
        }
        byte[] byArray = C1a946c5246ca0949bfd0e13d.sha256(C1a946c5246ca0949bfd0e13d.concat("jsmi2-entry-auth".getBytes(StandardCharsets.US_ASCII), {0}, string.getBytes(StandardCharsets.US_ASCII), {0}, string2.getBytes(StandardCharsets.UTF_8), {0}, string3.getBytes(StandardCharsets.UTF_8), {0}, string4.getBytes(StandardCharsets.US_ASCII), {0}, string5.getBytes(StandardCharsets.US_ASCII), {0}, string6.getBytes(StandardCharsets.US_ASCII)));
        return C1a946c5246ca0949bfd0e13d.hexLower(Arrays.copyOf(byArray, 8));
    }

    private static /* synthetic */ boolean isHex(String string, int n, int n2) {
        if (0 != 0) {
        }
        if (string == null || string.length() < n || string.length() > n2) {
            return false;
        }
        for (int i = 0; i < string.length(); ++i) {
            if (Character.digit(string.charAt(i), 16) >= 0) continue;
            return false;
        }
        return true;
    }

    private static /* synthetic */ boolean constantTimeAsciiEquals(String string, String string2) {
        if (0 != 0) {
        }
        if (string == null || string2 == null || string.length() != string2.length()) {
            return false;
        }
        int n = 0;
        for (int i = 0; i < string.length(); ++i) {
            n |= string.charAt(i) ^ string2.charAt(i);
        }
        return n == 0;
    }

    private static /* synthetic */ String hexLower(byte[] byArray) {
        if (0 != 0) {
        }
        char[] cArray = new char[byArray.length * 2];
        char[] cArray2 = "0123456789abcdef".toCharArray();
        for (int i = 0; i < byArray.length; ++i) {
            int n = byArray[i] & 0xFF;
            cArray[i * 2] = cArray2[n >>> 4];
            cArray[i * 2 + 1] = cArray2[n & 0xF];
        }
        return new String(cArray);
    }

    private static /* synthetic */ void installRuntimeResourceKeyIntoNative() {
        if (0 != 0) {
        }
        byte[] byArray = C1a946c5246ca0949bfd0e13d.runtimeResourceKey();
        try {
            C1a946c5246ca0949bfd0e13d.m_9c3b728463d0474b(byArray);
        }
        finally {
            Arrays.fill(byArray, (byte)0);
        }
    }

    private static /* synthetic */ String detectPlatform() {
        if (0 != 0) {
        }
        String string = System.getProperty("os.name", "").toLowerCase();
        String string2 = System.getProperty("os.arch", "").toLowerCase();
        if (string.contains("win") && (string2.contains("64") || string2.contains("amd64"))) {
            return "windows-x64";
        }
        if (string.contains("linux") && string2.contains("64")) {
            return "linux-x64";
        }
        if (string.contains("mac") && string2.contains("aarch64")) {
            return "macos-arm64";
        }
        if (string.contains("mac")) {
            return "macos-x64";
        }
        return null;
    }

    private static /* synthetic */ String debugNativeLoadMessage(String string, Throwable throwable) {
        if (0 != 0) {
        }
        if (!Boolean.getBoolean("javashroud.debugNativeLoad")) {
            return "native-unavailable";
        }
        return string + ":" + throwable.getClass().getName() + ":" + String.valueOf(throwable.getMessage());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ boolean tryLoadNative(String string, String string2) {
        if (0 != 0) {
        }
        String string3 = System.getProperty(C1a946c5246ca0949bfd0e13d.sealedLoaderPropertyName());
        boolean bl = false;
        try {
            C1a946c5246ca0949bfd0e13d.publishSealedNativeBindings();
            System.loadLibrary(C1a946c5246ca0949bfd0e13d.kernelBaseName() + string);
            loadMessage = "native:" + string + ":" + C1a946c5246ca0949bfd0e13d.initializeNativeKernel(string);
            C1a946c5246ca0949bfd0e13d.installRuntimeResourceKeyIntoNative();
            sealedNativeBindingsPublished = true;
            loadState = 1;
            try {
                C1a946c5246ca0949bfd0e13d.preloadRuntimeResourcesIntoNative();
                if (C1a946c5246ca0949bfd0e13d.verifyNativeAbiAfterLoad()) {
                    C1a946c5246ca0949bfd0e13d.verifyBootTokenAfterLoad();
                    bl = true;
                }
                boolean bl2 = bl;
                if (!bl) {
                    loadState = 0;
                    sealedNativeBindingsPublished = false;
                }
                return bl2;
            }
            catch (Throwable throwable) {
                try {
                    if (!bl) {
                        loadState = 0;
                        sealedNativeBindingsPublished = false;
                    }
                    throw throwable;
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                    boolean bl3 = false;
                    return bl3;
                }
            }
        }
        finally {
            if (!bl) {
                C1a946c5246ca0949bfd0e13d.restoreLoaderProperty(string3);
            }
        }
    }

    private static /* synthetic */ boolean tryLoadBundledNative(String string, String string2) {
        I31f5ed27eb7e1da2[] i31f5ed27eb7e1da2Array;
        if (0 != 0) {
        }
        for (I31f5ed27eb7e1da2 i31f5ed27eb7e1da2 : i31f5ed27eb7e1da2Array = C1a946c5246ca0949bfd0e13d.sealedBundledLibraryNames(string)) {
            if (!C1a946c5246ca0949bfd0e13d.tryLoadBundledNativeResource(string, i31f5ed27eb7e1da2.resourcePath, i31f5ed27eb7e1da2.fileSuffix)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ boolean tryLoadBundledNativeResource(String string, String string2, String string3) {
        byte[] byArray;
        File[] fileArray;
        try {
            fileArray = C1a946c5246ca0949bfd0e13d.resourceStream(string2);
            try {
                if (fileArray == null) {
                    boolean bl = false;
                    return bl;
                }
                byArray = C1a946c5246ca0949bfd0e13d.decodeSealedNativeResource(C1a946c5246ca0949bfd0e13d.readAll((InputStream)fileArray));
            }
            finally {
                if (fileArray != null) {
                    fileArray.close();
                }
            }
        }
        catch (Exception exception) {
            loadMessage = C1a946c5246ca0949bfd0e13d.debugNativeLoadMessage("native-resource-error:" + string2, exception);
            return false;
        }
        if (byArray == null) return false;
        if (byArray.length == 0) {
            return false;
        }
        fileArray = C1a946c5246ca0949bfd0e13d.nativeExtractDirectories();
        int n = fileArray.length;
        int n2 = 0;
        while (n2 < n) {
            File file = fileArray[n2];
            if (C1a946c5246ca0949bfd0e13d.tryLoadBundledNativeFromDirectory(string, string2, string3, byArray, file)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ boolean tryLoadBundledNativeFromDirectory(String string, String string2, String string3, byte[] byArray, File file) {
        if (0 != 0) {
        }
        File file2 = null;
        String string4 = System.getProperty(C1a946c5246ca0949bfd0e13d.sealedLoaderPropertyName());
        boolean bl = false;
        try {
            if (!C1a946c5246ca0949bfd0e13d.ensureNativeExtractDirectory(file)) {
                boolean bl2 = false;
                return bl2;
            }
            file2 = File.createTempFile(C1a946c5246ca0949bfd0e13d.nativeTempPrefix(string2), string3, file);
            file2.deleteOnExit();
            try (FileOutputStream fileOutputStream = new FileOutputStream(file2);){
                fileOutputStream.write(byArray);
            }
            file2.setReadable(true, true);
            file2.setWritable(true, true);
            file2.setExecutable(true, true);
            C1a946c5246ca0949bfd0e13d.publishSealedNativeBindings();
            System.load(file2.getAbsolutePath());
            loadMessage = "native:bundled:" + string + ":" + C1a946c5246ca0949bfd0e13d.initializeNativeKernel(string);
            C1a946c5246ca0949bfd0e13d.installRuntimeResourceKeyIntoNative();
            sealedNativeBindingsPublished = true;
            loadState = 1;
            try {
                C1a946c5246ca0949bfd0e13d.preloadRuntimeResourcesIntoNative();
                if (C1a946c5246ca0949bfd0e13d.verifyNativeAbiAfterLoad()) {
                    C1a946c5246ca0949bfd0e13d.verifyBootTokenAfterLoad();
                    bl = true;
                }
                boolean bl3 = bl;
                if (!bl) {
                    loadState = 0;
                    sealedNativeBindingsPublished = false;
                }
                return bl3;
            }
            catch (Throwable throwable) {
                try {
                    if (!bl) {
                        loadState = 0;
                        sealedNativeBindingsPublished = false;
                    }
                    throw throwable;
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                    loadMessage = C1a946c5246ca0949bfd0e13d.debugNativeLoadMessage("native:bundled-load-error", unsatisfiedLinkError);
                    if (file2 != null) {
                        file2.delete();
                    }
                    boolean bl4 = false;
                    return bl4;
                }
                catch (Exception exception) {
                    loadMessage = "native:bundled-init-error:" + exception.getClass().getName() + ":" + String.valueOf(exception.getMessage());
                    if (file2 != null) {
                        file2.delete();
                    }
                    boolean bl5 = false;
                    return bl5;
                }
            }
        }
        finally {
            if (!bl) {
                C1a946c5246ca0949bfd0e13d.restoreLoaderProperty(string4);
            }
        }
    }

    private static /* synthetic */ int initializeNativeKernel(String string) {
        int n;
        if (0 != 0) {
        }
        return (n = C1a946c5246ca0949bfd0e13d.m_f5c3faf913dbeb34(string)) == 2 ? C1a946c5246ca0949bfd0e13d.m_f5c3faf913dbeb34(string) : n;
    }

    private static /* synthetic */ File[] nativeExtractDirectories() {
        String string;
        if (0 != 0) {
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        C1a946c5246ca0949bfd0e13d.addNativeExtractDirectory(linkedHashSet, System.getProperty("javashroud.native.extract.dir", ""));
        String string2 = System.getProperty("user.home", "");
        if (string2 != null && string2.length() > 0) {
            C1a946c5246ca0949bfd0e13d.addNativeExtractDirectory(linkedHashSet, new File(new File(string2, ".javashroud"), "native"));
        }
        if ((string = System.getProperty("user.dir", "")) != null && string.length() > 0) {
            C1a946c5246ca0949bfd0e13d.addNativeExtractDirectory(linkedHashSet, new File(new File(string, ".javashroud-native"), "native"));
        }
        C1a946c5246ca0949bfd0e13d.addNativeExtractDirectory(linkedHashSet, System.getProperty("java.io.tmpdir", ""));
        File[] fileArray = new File[linkedHashSet.size()];
        int n = 0;
        for (String string3 : linkedHashSet) {
            fileArray[n++] = new File(string3);
        }
        return fileArray;
    }

    private static /* synthetic */ void addNativeExtractDirectory(LinkedHashSet<String> linkedHashSet, String string) {
        if (0 != 0) {
        }
        if (string == null) {
            return;
        }
        String string2 = string.trim();
        if (string2.length() == 0) {
            return;
        }
        C1a946c5246ca0949bfd0e13d.addNativeExtractDirectory(linkedHashSet, new File(string2));
    }

    private static /* synthetic */ void addNativeExtractDirectory(LinkedHashSet<String> linkedHashSet, File file) {
        if (0 != 0) {
        }
        if (file == null) {
            return;
        }
        try {
            linkedHashSet.add(file.getAbsoluteFile().getPath());
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
    }

    private static /* synthetic */ boolean ensureNativeExtractDirectory(File file) {
        try {
            if (0 != 0) {
            }
            if (file == null) {
                return false;
            }
            if (file.exists()) {
                return file.isDirectory() && file.canWrite();
            }
            return file.mkdirs() && file.isDirectory() && file.canWrite();
        }
        catch (SecurityException securityException) {
            return false;
        }
    }

    private static /* synthetic */ String nativeTempPrefix(String string) {
        if (0 != 0) {
        }
        int n = -2128831035;
        for (int i = 0; i < string.length(); ++i) {
            n ^= string.charAt(i) & 0xFF;
            n *= 16777619;
        }
        String string2 = Integer.toUnsignedString(n, 36);
        return ("n" + string2 + "xxxx").substring(0, 8);
    }

    private static /* synthetic */ InputStream resourceStream(String string) {
        InputStream inputStream;
        if (0 != 0) {
        }
        if ((inputStream = C1a946c5246ca0949bfd0e13d.class.getResourceAsStream("/" + string)) != null) {
            return inputStream;
        }
        ClassLoader classLoader = C1a946c5246ca0949bfd0e13d.class.getClassLoader();
        return classLoader == null ? null : classLoader.getResourceAsStream(string);
    }

    private static /* synthetic */ void publishSealedNativeBindings() {
        try {
            String[] stringArray;
            if (0 != 0) {
            }
            System.setProperty(C1a946c5246ca0949bfd0e13d.sealedLoaderPropertyName(), C1a946c5246ca0949bfd0e13d.class.getName().replace('.', '/'));
            String string = C1a946c5246ca0949bfd0e13d.sealedNativeIndexText();
            if (string == null || string.length() == 0) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            for (String string2 : stringArray = string.split("\n")) {
                String[] stringArray2 = string2.trim().split("\\|", -1);
                if (stringArray2.length == 3 && "B".equals(stringArray2[0])) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append('\n');
                    }
                    stringBuilder.append(stringArray2[1]).append('=').append(stringArray2[2]);
                    continue;
                }
                if (stringArray2.length != 3 || !"M".equals(stringArray2[0])) continue;
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append('\n');
                }
                stringBuilder2.append(stringArray2[1]).append('=').append(stringArray2[2]);
            }
            if (stringBuilder.length() > 0) {
                System.setProperty(C1a946c5246ca0949bfd0e13d.sealedBindingPropertyName(), C1a946c5246ca0949bfd0e13d.mergeBindingProperties(System.getProperty(C1a946c5246ca0949bfd0e13d.sealedBindingPropertyName()), stringBuilder.toString()));
            }
            if (stringBuilder2.length() > 0) {
                System.setProperty(C1a946c5246ca0949bfd0e13d.sealedMethodBindingPropertyName(), C1a946c5246ca0949bfd0e13d.mergeBindingProperties(System.getProperty(C1a946c5246ca0949bfd0e13d.sealedMethodBindingPropertyName()), stringBuilder2.toString()));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static /* synthetic */ void ensureSealedNativeBindingsPublished() {
        if (0 != 0) {
        }
        if (sealedNativeBindingsPublished) {
            return;
        }
        C1a946c5246ca0949bfd0e13d.publishSealedNativeBindings();
        sealedNativeBindingsPublished = true;
    }

    private static /* synthetic */ void restoreLoaderProperty(String string) {
        try {
            if (0 != 0) {
            }
            if (string == null) {
                System.clearProperty(C1a946c5246ca0949bfd0e13d.sealedLoaderPropertyName());
            } else {
                System.setProperty(C1a946c5246ca0949bfd0e13d.sealedLoaderPropertyName(), string);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static /* synthetic */ String mergeBindingProperties(String string, String string2) {
        if (0 != 0) {
        }
        if (string == null || string.length() == 0) {
            return string2;
        }
        if (string2 == null || string2.length() == 0) {
            return string;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        C1a946c5246ca0949bfd0e13d.appendBindingProperties(linkedHashMap, string);
        C1a946c5246ca0949bfd0e13d.appendBindingProperties(linkedHashMap, string2);
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('\n');
            }
            stringBuilder.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ void appendBindingProperties(LinkedHashMap<String, String> linkedHashMap, String string) {
        String[] stringArray;
        if (0 != 0) {
        }
        for (String string2 : stringArray = string.split("\n")) {
            int n = string2.indexOf(61);
            if (n <= 0) continue;
            linkedHashMap.put(string2.substring(0, n), string2.substring(n + 1));
        }
    }

    private static /* synthetic */ String sealedLoaderPropertyName() {
        if (0 != 0) {
        }
        return new String(new char[]{'j', '.', 'l'});
    }

    private static /* synthetic */ String sealedBindingPropertyName() {
        if (0 != 0) {
        }
        return new String(new char[]{'j', '.', 'b'});
    }

    private static /* synthetic */ String sealedMethodBindingPropertyName() {
        if (0 != 0) {
        }
        return new String(new char[]{'j', '.', 'm'});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String sealedNativeIndexText() {
        try (InputStream inputStream = C1a946c5246ca0949bfd0e13d.resourceStream(SEALED_NATIVE_INDEX_RESOURCE);){
            if (inputStream == null) {
                String string2 = null;
                return string2;
            }
            byte[] byArray = C1a946c5246ca0949bfd0e13d.decodeBootstrapNativeIndex(C1a946c5246ca0949bfd0e13d.readAll(inputStream));
            String string = byArray == null ? null : C1a946c5246ca0949bfd0e13d.decodeMaskedNativeIndexText(new String(byArray, StandardCharsets.UTF_8));
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static /* synthetic */ I31f5ed27eb7e1da2[] sealedBundledLibraryNames(String string) {
        try {
            String[] stringArray;
            String string2;
            if (0 != 0) {
            }
            if ((string2 = C1a946c5246ca0949bfd0e13d.sealedNativeIndexText()) == null || string2.length() == 0) {
                return new I31f5ed27eb7e1da2[0];
            }
            LinkedHashSet<I31f5ed27eb7e1da2> linkedHashSet = new LinkedHashSet<I31f5ed27eb7e1da2>();
            for (String string3 : stringArray = string2.split("\n")) {
                String[] stringArray2 = string3.trim().split("\\|", -1);
                if (stringArray2.length != 3 || !string.equals(stringArray2[0])) continue;
                linkedHashSet.add(new I31f5ed27eb7e1da2(stringArray2[1], stringArray2[2]));
            }
            return linkedHashSet.toArray(new I31f5ed27eb7e1da2[0]);
        }
        catch (Exception exception) {
            return new I31f5ed27eb7e1da2[0];
        }
    }

    private static /* synthetic */ byte[] decodeSealedNativeResource(byte[] byArray) {
        if (0 != 0) {
        }
        if (byArray == null || byArray.length == 0 || C1a946c5246ca0949bfd0e13d.hasRuntimeResourceHeader(byArray)) {
            return null;
        }
        return byArray;
    }

    private static /* synthetic */ String decodeMaskedNativeIndexText(String string) {
        if (0 != 0) {
        }
        if (string == null || !string.trim().startsWith("JSMI2|")) {
            return string;
        }
        try {
            byte[] byArray;
            int n;
            String[] stringArray = string.trim().split("\\|", -1);
            if (stringArray.length != 4) {
                return string;
            }
            byte[] byArray2 = C1a946c5246ca0949bfd0e13d.hexToBytes(stringArray[1]);
            byte[] byArray3 = C1a946c5246ca0949bfd0e13d.hexToBytes(stringArray[2]);
            byte[] byArray4 = C1a946c5246ca0949bfd0e13d.hexToBytes(stringArray[3]);
            if (byArray2.length != 16 || byArray4.length != 16) {
                return string;
            }
            byte[] byArray5 = new byte[byArray3.length];
            int n2 = 0;
            for (int i = 0; i < byArray3.length; i += n) {
                byArray = C1a946c5246ca0949bfd0e13d.sha256(C1a946c5246ca0949bfd0e13d.concat("jsmi2-mask".getBytes(StandardCharsets.US_ASCII), byArray2, C1a946c5246ca0949bfd0e13d.intBytes(n2++)));
                n = Math.min(byArray.length, byArray3.length - i);
                for (int j = 0; j < n; ++j) {
                    byArray5[i + j] = (byte)(byArray3[i + j] ^ byArray[j]);
                }
            }
            byArray = Arrays.copyOf(C1a946c5246ca0949bfd0e13d.sha256(C1a946c5246ca0949bfd0e13d.concat("jsmi2-tag".getBytes(StandardCharsets.US_ASCII), byArray2, byArray5)), 16);
            if (!Arrays.equals(byArray, byArray4)) {
                return string;
            }
            return new String(byArray5, StandardCharsets.UTF_8);
        }
        catch (Exception exception) {
            return string;
        }
    }

    private static /* synthetic */ byte[] hexToBytes(String string) {
        if (0 != 0) {
        }
        if ((string.length() & 1) != 0) {
            throw new IllegalArgumentException("odd hex");
        }
        byte[] byArray = new byte[string.length() / 2];
        for (int i = 0; i < byArray.length; ++i) {
            int n = Character.digit(string.charAt(i * 2), 16);
            int n2 = Character.digit(string.charAt(i * 2 + 1), 16);
            if (n < 0 || n2 < 0) {
                throw new IllegalArgumentException("bad hex");
            }
            byArray[i] = (byte)(n << 4 | n2);
        }
        return byArray;
    }

    public static /* synthetic */ byte[] decodeRuntimeResourceForNative(byte[] byArray) {
        byte[] byArray2;
        if (0 != 0) {
        }
        if ((byArray2 = C1a946c5246ca0949bfd0e13d.decodeRuntimeResource(byArray)) == null) {
            throw new IllegalArgumentException("unsupported runtime resource envelope");
        }
        return byArray2;
    }

    private static /* synthetic */ byte[] runtimeResourceKey() {
        if (0 != 0) {
        }
        byte[] byArray = C1a946c5246ca0949bfd0e13d.jsRrkShare0_2c7e0fabf2();
        byte[] byArray2 = C1a946c5246ca0949bfd0e13d.jsRrkShare1_2c7e0fabf2();
        byte[] byArray3 = C1a946c5246ca0949bfd0e13d.jsRrkShare2_2c7e0fabf2();
        byte[] byArray4 = new byte[]{(byte)(byArray[0] ^ byArray2[0] ^ byArray3[0]), (byte)(byArray[1] ^ byArray2[1] ^ byArray3[1]), (byte)(byArray[2] ^ byArray2[2] ^ byArray3[2]), (byte)(byArray[3] ^ byArray2[3] ^ byArray3[3]), (byte)(byArray[4] ^ byArray2[4] ^ byArray3[4]), (byte)(byArray[5] ^ byArray2[5] ^ byArray3[5]), (byte)(byArray[6] ^ byArray2[6] ^ byArray3[6]), (byte)(byArray[7] ^ byArray2[7] ^ byArray3[7]), (byte)(byArray[8] ^ byArray2[8] ^ byArray3[8]), (byte)(byArray[9] ^ byArray2[9] ^ byArray3[9]), (byte)(byArray[10] ^ byArray2[10] ^ byArray3[10]), (byte)(byArray[11] ^ byArray2[11] ^ byArray3[11]), (byte)(byArray[12] ^ byArray2[12] ^ byArray3[12]), (byte)(byArray[13] ^ byArray2[13] ^ byArray3[13]), (byte)(byArray[14] ^ byArray2[14] ^ byArray3[14]), (byte)(byArray[15] ^ byArray2[15] ^ byArray3[15]), (byte)(byArray[16] ^ byArray2[16] ^ byArray3[16]), (byte)(byArray[17] ^ byArray2[17] ^ byArray3[17]), (byte)(byArray[18] ^ byArray2[18] ^ byArray3[18]), (byte)(byArray[19] ^ byArray2[19] ^ byArray3[19]), (byte)(byArray[20] ^ byArray2[20] ^ byArray3[20]), (byte)(byArray[21] ^ byArray2[21] ^ byArray3[21]), (byte)(byArray[22] ^ byArray2[22] ^ byArray3[22]), (byte)(byArray[23] ^ byArray2[23] ^ byArray3[23]), (byte)(byArray[24] ^ byArray2[24] ^ byArray3[24]), (byte)(byArray[25] ^ byArray2[25] ^ byArray3[25]), (byte)(byArray[26] ^ byArray2[26] ^ byArray3[26]), (byte)(byArray[27] ^ byArray2[27] ^ byArray3[27]), (byte)(byArray[28] ^ byArray2[28] ^ byArray3[28]), (byte)(byArray[29] ^ byArray2[29] ^ byArray3[29]), (byte)(byArray[30] ^ byArray2[30] ^ byArray3[30]), (byte)(byArray[31] ^ byArray2[31] ^ byArray3[31])};
        Arrays.fill(byArray, (byte)0);
        Arrays.fill(byArray2, (byte)0);
        Arrays.fill(byArray3, (byte)0);
        return byArray4;
    }

    public static /* synthetic */ byte[] decodeRuntimeResourceEnvelope(byte[] byArray) {
        if (0 != 0) {
        }
        return C1a946c5246ca0949bfd0e13d.decodeRuntimeResource(byArray);
    }

    private static /* synthetic */ byte[] decodeBootstrapNativeIndex(byte[] byArray) {
        if (0 != 0) {
        }
        if (byArray == null || byArray.length < 42) {
            return null;
        }
        if ((byArray[0] & 0xFF) != 74 || (byArray[1] & 0xFF) != 83 || (byArray[2] & 0xFF) != 66 || (byArray[3] & 0xFF) != 73) {
            return null;
        }
        if ((byArray[4] & 0xFF) != 1) {
            return null;
        }
        int n = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 5);
        if (n < 0) {
            return null;
        }
        int n2 = 9;
        int n3 = n2 + n;
        if (n3 + 33 != byArray.length || (byArray[byArray.length - 1] & 0xFF) != 32) {
            return null;
        }
        byte[] byArray2 = C1a946c5246ca0949bfd0e13d.hmacSha256(C1a946c5246ca0949bfd0e13d.concat("jsbi-auth".getBytes(StandardCharsets.US_ASCII), Arrays.copyOfRange(byArray, 0, n3)));
        if (!C1a946c5246ca0949bfd0e13d.constantTimeEquals(byArray2, byArray, n3)) {
            return null;
        }
        return Arrays.copyOfRange(byArray, n2, n3);
    }

    private static /* synthetic */ byte[] decodeRuntimeResource(byte[] byArray) {
        if (0 != 0) {
        }
        return C1a946c5246ca0949bfd0e13d.decodeRuntimeResource(byArray, false);
    }

    private static /* synthetic */ byte[] decodeRuntimeResource(byte[] byArray, boolean bl) {
        if (0 != 0) {
        }
        if (!C1a946c5246ca0949bfd0e13d.hasRuntimeResourceHeader(byArray)) {
            return null;
        }
        int n = byArray[4] & 0xFF;
        if (n == 6) {
            return C1a946c5246ca0949bfd0e13d.decodeRuntimeResourceCurrent(byArray, bl);
        }
        if (n == 5) {
            return C1a946c5246ca0949bfd0e13d.decodeRuntimeResourceLegacy(byArray, bl);
        }
        return null;
    }

    private static /* synthetic */ boolean hasRuntimeResourceHeader(byte[] byArray) {
        if (0 != 0) {
        }
        return byArray != null && byArray.length >= 4 && (byArray[0] & 0xFF) == 74 && (byArray[1] & 0xFF) == 83 && (byArray[2] & 0xFF) == 82 && (byArray[3] & 0xFF) == 80;
    }

    private static /* synthetic */ byte[] decodeRuntimeResourceCurrent(byte[] byArray, boolean bl) {
        byte[] byArray2;
        if (0 != 0) {
        }
        if (byArray.length < 154 || (byArray[byArray.length - 1] & 0xFF) != 32) {
            return null;
        }
        byte[] byArray3 = Arrays.copyOfRange(byArray, 5, 21);
        int n = C1a946c5246ca0949bfd0e13d.readSealedResourceLe16(byArray, 21);
        int n2 = C1a946c5246ca0949bfd0e13d.readSealedResourceLe16(byArray, 23);
        if (n != 96 || n2 != 32) {
            return null;
        }
        int n3 = 25;
        int n4 = n3 + n;
        if (n4 + 33 > byArray.length) {
            return null;
        }
        int n5 = byArray.length - 33;
        byte[] byArray4 = C1a946c5246ca0949bfd0e13d.hmacSha256(C1a946c5246ca0949bfd0e13d.concat("jsrp-auth-v2".getBytes(StandardCharsets.US_ASCII), byArray3, Arrays.copyOfRange(byArray, 0, n5)));
        if (!C1a946c5246ca0949bfd0e13d.constantTimeEquals(byArray4, byArray, n5)) {
            return null;
        }
        byte[] byArray5 = C1a946c5246ca0949bfd0e13d.runtimeResourceAesCtrWithDomains(Arrays.copyOfRange(byArray, n3, n4), byArray3, C1a946c5246ca0949bfd0e13d.intBytes(0), C1a946c5246ca0949bfd0e13d.intBytes(0), C1a946c5246ca0949bfd0e13d.intBytes(0));
        I83128d6040484973 i83128d6040484973 = C1a946c5246ca0949bfd0e13d.parseRuntimeResourceMetadata(byArray5);
        if (i83128d6040484973 == null) {
            return null;
        }
        if (i83128d6040484973.kindId < 1 || i83128d6040484973.kindId > 4) {
            return null;
        }
        if (i83128d6040484973.layerCount < 1 || i83128d6040484973.layerCount > 7 || i83128d6040484973.variantId > 127) {
            return null;
        }
        if (i83128d6040484973.plainLength < 0 || i83128d6040484973.storedLength < 0 || i83128d6040484973.bodyLength < 0) {
            return null;
        }
        if (n4 + i83128d6040484973.bodyLength != n5) {
            return null;
        }
        byte[] byArray6 = Arrays.copyOfRange(byArray, n4, n5);
        byte[] byArray7 = C1a946c5246ca0949bfd0e13d.runtimeResourceAesCtr(byArray6, byArray3, i83128d6040484973.kindId, i83128d6040484973.variantId, i83128d6040484973.layerCount);
        if (byArray7.length != i83128d6040484973.storedLength) {
            return null;
        }
        if (!Arrays.equals(C1a946c5246ca0949bfd0e13d.sha256(byArray7), i83128d6040484973.storedHash)) {
            return null;
        }
        Object object = i83128d6040484973.compressed ? (Object)(bl ? C1a946c5246ca0949bfd0e13d.decompressEmbeddedZstd(byArray7, i83128d6040484973.plainLength) : null) : (byArray2 = byArray7);
        if (byArray2 == null || byArray2.length != i83128d6040484973.plainLength) {
            return null;
        }
        return (byte[])(Arrays.equals(C1a946c5246ca0949bfd0e13d.sha256(byArray2), i83128d6040484973.plainHash) ? byArray2 : null);
    }

    private static /* synthetic */ byte[] decodeRuntimeResourceLegacy(byte[] byArray, boolean bl) {
        if (0 != 0) {
        }
        if (byArray.length < 73 || (byArray[byArray.length - 1] & 0xFF) != 32) {
            return null;
        }
        int n = byArray[5] & 0xFF;
        int n2 = byArray[6] & 0xFF;
        int n3 = byArray[7] & 0xFF;
        boolean bl2 = (n3 & 0x80) != 0;
        int n4 = n3 & 0x7F;
        if (n2 < 1 || n2 > 7) {
            return null;
        }
        byte[] byArray2 = Arrays.copyOfRange(byArray, 8, 24);
        int n5 = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 24);
        int n6 = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 28);
        int n7 = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 32);
        int n8 = 40 + n7;
        if (n5 < 0 || n6 < 0 || n7 < 0) {
            return null;
        }
        if (n8 + 33 != byArray.length) {
            return null;
        }
        byte[] byArray3 = C1a946c5246ca0949bfd0e13d.hmacSha256(C1a946c5246ca0949bfd0e13d.concat("jsrp-auth".getBytes(StandardCharsets.US_ASCII), byArray2, Arrays.copyOfRange(byArray, 0, n8)));
        if (!C1a946c5246ca0949bfd0e13d.constantTimeEquals(byArray3, byArray, n8)) {
            return null;
        }
        byte[] byArray4 = Arrays.copyOfRange(byArray, 40, n8);
        byte[] byArray5 = C1a946c5246ca0949bfd0e13d.runtimeResourceAesCtr(byArray4, byArray2, n, n4, n2);
        if (byArray5.length != n6) {
            return null;
        }
        byte[] byArray6 = bl2 ? (Object)(bl ? C1a946c5246ca0949bfd0e13d.decompressEmbeddedZstd(byArray5, n5) : null) : byArray5;
        return byArray6 != null && byArray6.length == n5 ? byArray6 : null;
    }

    private static /* synthetic */ byte[] decompressEmbeddedZstd(byte[] byArray, int n) {
        int n2;
        long l2;
        boolean bl;
        int n3;
        if (0 != 0) {
        }
        if (n < 0 || byArray == null || byArray.length < 7) {
            return null;
        }
        int n4 = 0;
        if (C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, n4) != -47205080) {
            return null;
        }
        n4 += 4;
        if (((n3 = byArray[n4++] & 0xFF) & 8) != 0 || (n3 & 3) != 0) {
            return null;
        }
        int n5 = n3 >>> 6;
        boolean bl2 = (n3 & 0x20) != 0;
        boolean bl3 = bl = (n3 & 4) != 0;
        if (!bl2) {
            if (n4 >= byArray.length) {
                return null;
            }
            ++n4;
        }
        if ((l2 = C1a946c5246ca0949bfd0e13d.readZstdFrameContentSize(byArray, n4, n2 = n5 == 0 ? (bl2 ? 1 : 0) : (n5 == 1 ? 2 : (n5 == 2 ? 4 : 8)))) != (long)n) {
            return null;
        }
        n4 += n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        boolean bl4 = false;
        while (!bl4) {
            if (n4 + 3 > byArray.length) {
                return null;
            }
            int n6 = byArray[n4] & 0xFF | (byArray[n4 + 1] & 0xFF) << 8 | (byArray[n4 + 2] & 0xFF) << 16;
            n4 += 3;
            bl4 = (n6 & 1) != 0;
            int n7 = n6 >>> 1 & 3;
            int n8 = n6 >>> 3;
            if (n7 == 0) {
                if (n4 + n8 > byArray.length) {
                    return null;
                }
                byteArrayOutputStream.write(byArray, n4, n8);
                n4 += n8;
            } else if (n7 == 1) {
                if (n4 >= byArray.length) {
                    return null;
                }
                for (int i = 0; i < n8; ++i) {
                    byteArrayOutputStream.write(byArray[n4] & 0xFF);
                }
                ++n4;
            } else {
                return null;
            }
            if (byteArrayOutputStream.size() <= n) continue;
            return null;
        }
        if (bl) {
            if (n4 + 4 > byArray.length) {
                return null;
            }
            n4 += 4;
        }
        if (n4 != byArray.length || byteArrayOutputStream.size() != n) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static /* synthetic */ long readZstdFrameContentSize(byte[] byArray, int n, int n2) {
        if (0 != 0) {
        }
        if (n2 < 0 || n2 > 8 || n < 0 || n + n2 > byArray.length) {
            return -1L;
        }
        long l2 = 0L;
        for (int i = 0; i < n2; ++i) {
            l2 |= (long)(byArray[n + i] & 0xFF) << 8 * i;
        }
        return n2 == 2 ? l2 + 256L : l2;
    }

    private static /* synthetic */ byte[] runtimeResourceAesCtr(byte[] byArray, byte[] byArray2, int n, int n2, int n3) {
        if (0 != 0) {
        }
        return C1a946c5246ca0949bfd0e13d.runtimeResourceAesCtrWithDomains(byArray, byArray2, C1a946c5246ca0949bfd0e13d.intBytes(n), C1a946c5246ca0949bfd0e13d.intBytes(n2), C1a946c5246ca0949bfd0e13d.intBytes(n3));
    }

    private static /* synthetic */ byte[] runtimeResourceAesCtrWithDomains(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        try {
            if (0 != 0) {
            }
            byte[] byArray6 = Arrays.copyOfRange(C1a946c5246ca0949bfd0e13d.hmacSha256(C1a946c5246ca0949bfd0e13d.concat("jsrp-aes-key".getBytes(StandardCharsets.US_ASCII), byArray2, byArray3, byArray4, byArray5)), 0, 16);
            byte[] byArray7 = Arrays.copyOfRange(C1a946c5246ca0949bfd0e13d.hmacSha256(C1a946c5246ca0949bfd0e13d.concat("jsrp-aes-iv".getBytes(StandardCharsets.US_ASCII), byArray2, byArray3, byArray4, byArray5)), 0, 16);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(2, (Key)new SecretKeySpec(byArray6, "AES"), new IvParameterSpec(byArray7));
            return cipher.doFinal(byArray);
        }
        catch (Exception exception) {
            return new byte[0];
        }
    }

    private static /* synthetic */ I83128d6040484973 parseRuntimeResourceMetadata(byte[] byArray) {
        if (0 != 0) {
        }
        if (byArray == null || byArray.length != 96) {
            return null;
        }
        if (byArray[0] != 77 || byArray[1] != 50 || byArray[2] != 1) {
            return null;
        }
        int n = byArray[6] & 0xFF;
        if ((n & 0xFE) != 0) {
            return null;
        }
        int n2 = C1a946c5246ca0949bfd0e13d.readSealedResourceBe32(C1a946c5246ca0949bfd0e13d.sha256(Arrays.copyOfRange(byArray, 0, 92)), 0);
        if (C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 92) != n2) {
            return null;
        }
        I83128d6040484973 i83128d6040484973 = new I83128d6040484973();
        i83128d6040484973.kindId = byArray[3] & 0xFF;
        i83128d6040484973.layerCount = byArray[4] & 0xFF;
        i83128d6040484973.variantId = byArray[5] & 0xFF;
        i83128d6040484973.compressed = (n & 1) != 0;
        i83128d6040484973.plainLength = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 8);
        i83128d6040484973.storedLength = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 12);
        i83128d6040484973.bodyLength = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 16);
        i83128d6040484973.keyId = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 20);
        i83128d6040484973.seed = C1a946c5246ca0949bfd0e13d.readSealedResourceLe32(byArray, 24);
        i83128d6040484973.plainHash = Arrays.copyOfRange(byArray, 28, 60);
        i83128d6040484973.storedHash = Arrays.copyOfRange(byArray, 60, 92);
        return i83128d6040484973;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ byte[] hmacSha256(byte[] byArray) {
        if (0 != 0) {
        }
        byte[] byArray2 = C1a946c5246ca0949bfd0e13d.runtimeResourceKey();
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(byArray2, "HmacSHA256"));
            byte[] byArray3 = mac.doFinal(byArray);
            return byArray3;
        }
        catch (Exception exception) {
            byte[] byArray4 = new byte[32];
            return byArray4;
        }
        finally {
            Arrays.fill(byArray2, (byte)0);
        }
    }

    public static /* synthetic */ byte[] deriveClassEncryptionKey(byte[] byArray, byte[] byArray2, int n) {
        if (0 != 0) {
        }
        if (!C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("loader", "auto", "vm-diverse");
        }
        if (!C1a946c5246ca0949bfd0e13d.isNativeLoaded()) {
            throw new SecurityException("class-encryption key derivation requires the sealed native kernel; no Java fallback (" + loadMessage + ")");
        }
        return C1a946c5246ca0949bfd0e13d.nativeDeriveClassEncryptionKey(byArray, byArray2, n);
    }

    private static /* synthetic */ byte[] concat(byte[] ... byArray) {
        if (0 != 0) {
        }
        int n = 0;
        for (byte[] byArray2 : byArray) {
            n += byArray2.length;
        }
        byte[] byArray3 = new byte[n];
        int n2 = 0;
        for (byte[] byArray4 : byArray) {
            System.arraycopy(byArray4, 0, byArray3, n2, byArray4.length);
            n2 += byArray4.length;
        }
        return byArray3;
    }

    private static /* synthetic */ byte[] intBytes(int n) {
        if (0 != 0) {
        }
        return new byte[]{(byte)(n >>> 24), (byte)(n >>> 16), (byte)(n >>> 8), (byte)n};
    }

    private static /* synthetic */ boolean constantTimeEquals(byte[] byArray, byte[] byArray2, int n) {
        if (0 != 0) {
        }
        if (n < 0 || n + byArray.length > byArray2.length) {
            return false;
        }
        int n2 = 0;
        for (int i = 0; i < byArray.length; ++i) {
            n2 |= (byArray[i] ^ byArray2[n + i]) & 0xFF;
        }
        return n2 == 0;
    }

    private static /* synthetic */ byte[] sha256(byte[] byArray) {
        try {
            if (0 != 0) {
            }
            return MessageDigest.getInstance("SHA-256").digest(byArray);
        }
        catch (Exception exception) {
            return new byte[32];
        }
    }

    private static /* synthetic */ int readSealedResourceLe16(byte[] byArray, int n) {
        if (0 != 0) {
        }
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8;
    }

    private static /* synthetic */ int readSealedResourceLe32(byte[] byArray, int n) {
        if (0 != 0) {
        }
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 3] & 0xFF) << 24;
    }

    private static /* synthetic */ int readSealedResourceBe32(byte[] byArray, int n) {
        if (0 != 0) {
        }
        return (byArray[n] & 0xFF) << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    private static /* synthetic */ byte[] readAll(InputStream inputStream) throws Exception {
        int n;
        if (0 != 0) {
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        while ((n = inputStream.read(byArray)) > 0) {
            byteArrayOutputStream.write(byArray, 0, n);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static /* synthetic */ String kernelBaseName() {
        if (0 != 0) {
        }
        return new String(new char[]{'j', 's', '_', 'k', 'e', 'r', 'n', 'e', 'l', '_'});
    }

    static {
        loadState = 0;
        loadMessage = "";
        diversifiedVmEnabled = false;
        vmSelfCheck = "";
        nativeBootToken = 0L;
        nativeSelfCheckFailed = false;
        sealedNativeBindingsPublished = false;
        SAM_LAMBDA_CACHE = new ConcurrentHashMap<String, Object[]>();
    }

    private static /* synthetic */ byte[] jsRrkShare0_2c7e0fabf2() {
        if (0 != 0) {
        }
        return new byte[]{-3, -68, 68, -72, -113, 89, 127, -29, -101, -11, 15, -9, 31, -67, 40, 93, 26, 42, -97, 0, 101, 125, -18, 116, -117, -32, -78, -84, -104, 41, 19, 40};
    }

    private static /* synthetic */ byte[] jsRrkShare1_2c7e0fabf2() {
        if (0 != 0) {
        }
        return new byte[]{-32, -23, 2, 96, -124, 108, 22, 127, -124, -23, 104, -19, 0, -100, -26, 63, 17, -19, -104, 25, -91, 52, -93, -79, -31, -50, -93, 61, 101, -80, 0, 63};
    }

    private static /* synthetic */ byte[] jsRrkShare2_2c7e0fabf2() {
        if (0 != 0) {
        }
        return new byte[]{-104, -123, 19, 51, 51, 115, 95, -6, 25, -41, -84, 80, -125, 68, 21, -88, 84, -7, -22, 14, -75, -13, -12, -115, 52, -1, -105, 2, 53, -30, -108, 99};
    }

    private static final class Id83932b454d8c605 {
        final /* synthetic */ Class<?> type;
        final /* synthetic */ int nextIndex;

        Id83932b454d8c605(Class<?> clazz, int n) {
            this.type = clazz;
            this.nextIndex = n;
        }
    }

    private static final class I31f5ed27eb7e1da2 {
        final /* synthetic */ String resourcePath;
        final /* synthetic */ String fileSuffix;

        I31f5ed27eb7e1da2(String string, String string2) {
            this.resourcePath = string;
            this.fileSuffix = string2;
        }

        public /* synthetic */ boolean equals(Object object) {
            if (0 != 0) {
            }
            if (!(object instanceof I31f5ed27eb7e1da2)) {
                return false;
            }
            I31f5ed27eb7e1da2 i31f5ed27eb7e1da2 = (I31f5ed27eb7e1da2)object;
            return this.resourcePath.equals(i31f5ed27eb7e1da2.resourcePath) && this.fileSuffix.equals(i31f5ed27eb7e1da2.fileSuffix);
        }

        public /* synthetic */ int hashCode() {
            if (0 != 0) {
            }
            return this.resourcePath.hashCode() * 31 + this.fileSuffix.hashCode();
        }
    }

    private static final class I83128d6040484973 {
        /* synthetic */ int kindId;
        /* synthetic */ int layerCount;
        /* synthetic */ int variantId;
        /* synthetic */ boolean compressed;
        /* synthetic */ int plainLength;
        /* synthetic */ int storedLength;
        /* synthetic */ int bodyLength;
        /* synthetic */ int keyId;
        /* synthetic */ int seed;
        /* synthetic */ byte[] plainHash;
        /* synthetic */ byte[] storedHash;

        private I83128d6040484973() {
        }
    }
}

