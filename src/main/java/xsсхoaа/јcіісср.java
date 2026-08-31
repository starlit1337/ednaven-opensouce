/*
 * Decompiled with CFR 0.152.
 */
package xs\u0441\u0445oa\u0430;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.class_286;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;

public class \u0458c\u0456\u0456\u0441\u0441\u0440 {
    private static final /* synthetic */ FloatBuffer hosp\u0441c;
    public static /* synthetic */ int xeap;
    private static /* synthetic */ int \u043e\u04bb\u0458\u0440e;

    public \u0458c\u0456\u0456\u0441\u0441\u0440() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public static /* synthetic */ int c\u0455\u0430() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm0("_glGenVertexArrays", _glGenVertexArrays());
    }

    public static /* synthetic */ int aj\u0458\u04bb\u0445o() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm1("_glGenBuffers", _glGenBuffers());
    }

    public static /* synthetic */ int hie() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm2("_genTexture", _genTexture());
    }

    public static /* synthetic */ int \u0441\u04bbcscc\u04bb() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm3("glGenFramebuffers", glGenFramebuffers());
    }

    public static /* synthetic */ void eo\u0440\u0440ai(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm4("glDeleteShader", glDeleteShader(int ), (int)n);
    }

    public static /* synthetic */ void \u0458\u0430j\u04bb(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm5("_deleteTexture", _deleteTexture(int ), (int)n);
    }

    public static /* synthetic */ void ajxa\u04bbj\u0435(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm6("_glDeleteFramebuffers", _glDeleteFramebuffers(int ), (int)n);
    }

    public static /* synthetic */ void hs\u0430\u0430c\u0445\u0430(int n) {
        block9: {
            block8: {
                if (2 * 2 * 2 >= 0) {
                }
                if (0 != 0) {
                }
                if (n < 0) break block8;
                try {
                    \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm7("_glBindVertexArray", _glBindVertexArray(int ), (int)n);
                    class_286.field_38982 = null;
                }
                catch (Exception exception) {
                    String string = exception.getMessage();
                    int n2 = n;
                    byte[] byArray = new byte[-1399980335 + 1399980353];
                    byArray[0] = -1444622278 + 1444622326;
                    byArray[1] = -12734276 + 12734254;
                    byArray[2] = -1971201363 + 1971201410;
                    byArray[3] = 2;
                    byArray[4] = -1135539574 + 1135539697;
                    byArray[5] = -1318438543 + 1318438437;
                    byArray[-194917046 + 194917052] = -1524888109 + 1524888039;
                    byArray[-1422626642 + 1422626649] = -1043915408 + 1043915393;
                    byArray[-118335528 + 118335536] = -1467636642 + 1467636517;
                    byArray[-461285673 + 461285682] = -1911161504 + 1911161490;
                    byArray[-1878440819 + 1878440829] = -2817757 + 2817711;
                    byArray[-406414242 + 406414253] = -381224136 + 381224098;
                    byArray[-1168004065 + 1168004077] = -124036380 + 124036307;
                    byArray[-2081570028 + 2081570041] = -1;
                    byArray[-180146181 + 180146195] = -1976876558 + 1976876657;
                    byArray[-1877987728 + 1877987743] = -1261502733 + 1261502688;
                    byArray[-1672210765 + 1672210781] = -2002209443 + 2002209561;
                    byArray[-2097887839 + 2097887856] = -834588747 + 834588817;
                    System.err.println((String)((Object)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm8("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(696533183 + 585108388), (int)(-2013017674 + 1364266910))) + n2 + (String)((Object)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm8("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-228968995 + 228968984, -1041212601 + 1041212536}, (int)(2010870260 + 2081128946), (int)(-1191581168 + 842268957))) + string);
                }
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
                break block9;
                break block9;
            }
            int n3 = n;
            byte[] byArray = new byte[-1878818179 + 1878818219];
            byArray[0] = -91146855 + 91146825;
            byArray[1] = -525900426 + 525900310;
            byArray[2] = -759477918 + 759477983;
            byArray[3] = -1555891147 + 1555891174;
            byArray[4] = -248381828 + 248381725;
            byArray[5] = -1687628608 + 1687628568;
            byArray[-1212565581 + 1212565587] = -699574690 + 699574589;
            byArray[-128906668 + 128906675] = -1629604190 + 1629604183;
            byArray[-1322833941 + 1322833949] = -177322592 + 177322624;
            byArray[-1981350094 + 1981350103] = -1961091538 + 1961091650;
            byArray[-913604157 + 913604167] = -1397631081 + 1397631017;
            byArray[-40446421 + 40446432] = -637770097 + 637770159;
            byArray[-1569940361 + 1569940373] = -2100090034 + 2100089924;
            byArray[-1802014533 + 1802014546] = -566616870 + 566616795;
            byArray[-767098857 + 767098871] = -319526155 + 319526139;
            byArray[-1450538901 + 1450538916] = -1911615172 + 1911615231;
            byArray[-1202818568 + 1202818584] = -819107192 + 819107261;
            byArray[-1858956300 + 1858956317] = -668511136 + 668511115;
            byArray[-985916930 + 985916948] = -1178755226 + 1178755339;
            byArray[-642441157 + 642441176] = -50506311 + 50506241;
            byArray[-62984498 + 62984518] = -284982452 + 284982495;
            byArray[-89064657 + 89064678] = -76180443 + 76180337;
            byArray[-1258293544 + 1258293566] = -291054628 + 291054521;
            byArray[-792236411 + 792236434] = -532982048 + 532982157;
            byArray[-1032401850 + 1032401874] = -268125214 + 268125255;
            byArray[-1456625574 + 1456625599] = -867162014 + 867161960;
            byArray[-1293700658 + 1293700684] = -1606193573 + 1606193584;
            byArray[-380678227 + 380678254] = -1898558467 + 1898558416;
            byArray[-1299487141 + 1299487169] = -186519061 + 186519165;
            byArray[-1654840639 + 1654840668] = -54880109 + 54880068;
            byArray[-1851406947 + 1851406977] = -1116085375 + 1116085284;
            byArray[-961389225 + 961389256] = -253446007 + 253446036;
            byArray[-785177738 + 785177770] = -131840205 + 131840307;
            byArray[-1775663921 + 1775663954] = -2124610407 + 2124610324;
            byArray[-2097336245 + 2097336279] = -1696544676 + 1696544790;
            byArray[-895150044 + 895150079] = -1882871106 + 1882871164;
            byArray[-37284818 + 37284854] = -152787096 + 152787076;
            byArray[-2095414836 + 2095414873] = -1980164162 + 1980164191;
            byArray[-1132638481 + 1132638519] = -198069734 + 198069644;
            byArray[-2060088973 + 2060089012] = -184934798 + 184934726;
            System.err.println((String)((Object)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm8("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1130656120 + 118437153), (int)(-1919429192 + 576248376))) + n3);
        }
    }

    public static /* synthetic */ void \u0445xijxs\u0456(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm9("_glBindBuffer", _glBindBuffer(int int ), (int)(-1516183789 + 1516218751), (int)n);
    }

    public static /* synthetic */ void eo\u0440ic(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (n != 0) {
            \u043e\u04bb\u0458\u0440e = xeap;
        }
        try {
            int n2 = n != 0 ? n : \u043e\u04bb\u0458\u0440e;
            \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm9("_glBindBuffer", _glBindBuffer(int int ), (int)(-1255993286 + 1256028249), (int)n2);
        }
        catch (Exception exception) {
            String string = exception.getMessage();
            byte[] byArray = new byte[-102543316 + 102543335];
            byArray[0] = -1986898314 + 1986898290;
            byArray[1] = -810054572 + 810054504;
            byArray[2] = -133153210 + 133153282;
            byArray[3] = -1716661946 + 1716661857;
            byArray[4] = -1157144870 + 1157144868;
            byArray[5] = -1008745993 + 1008745955;
            byArray[-777314061 + 777314067] = -137101668 + 137101761;
            byArray[-1778641945 + 1778641952] = -605319349 + 605319418;
            byArray[-1704686187 + 1704686195] = 1;
            byArray[-1226758690 + 1226758699] = -79305403 + 79305399;
            byArray[-940601488 + 940601498] = -1238803531 + 1238803404;
            byArray[-1256301560 + 1256301571] = -1541135209 + 1541135086;
            byArray[-446752716 + 446752728] = -1036038965 + 1036039087;
            byArray[-143992414 + 143992427] = -1551371844 + 1551371882;
            byArray[-807701744 + 807701758] = -2010607589 + 2010607572;
            byArray[-1697435467 + 1697435482] = -400690689 + 400690568;
            byArray[-1904270374 + 1904270390] = -431778229 + 431778175;
            byArray[-781838148 + 781838165] = -1762118018 + 1762118025;
            byArray[-379556544 + 379556562] = -1486811205 + 1486811133;
            System.err.println((String)((Object)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm8("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(432621775 + 903087821), (int)(-677102549 + 74620907))) + string);
        }
    }

    public static /* synthetic */ void c\u0441\u0440\u04bb\u0430a(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm10("_glBindFramebuffer", _glBindFramebuffer(int int ), (int)(-579597742 + 579633902), (int)n);
    }

    public static /* synthetic */ void \u043e\u0440\u0440\u0445ha\u0430(int n, ByteBuffer byteBuffer, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm11("_glBufferData", _glBufferData(int java.nio.ByteBuffer int ), (int)n, (ByteBuffer)byteBuffer, (int)n2);
    }

    public static /* synthetic */ void \u0435\u0445ia\u0445(int n, int n2, int n3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm12("_drawElements", _drawElements(int int int long ), (int)n, (int)n2, (int)n3, (long)0L);
    }

    public static /* synthetic */ void \u0456ea\u0435\u0456\u0430s(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm13("assertOnRenderThread", assertOnRenderThread());
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm14("glEnableVertexAttribArray", glEnableVertexAttribArray(int ), (int)n);
    }

    public static /* synthetic */ void i\u0455\u0458\u0430\u0441s\u0458(int n, int n2, int n3, boolean bl, int n4, long l2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm15("_vertexAttribPointer", _vertexAttribPointer(int int int boolean int long ), (int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (long)l2);
    }

    public static /* synthetic */ int \u0458\u04bbe(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm16("glCreateShader", glCreateShader(int ), (int)n);
    }

    public static /* synthetic */ void ii\u04bb\u04bbj(int n, String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm18("glShaderSource", glShaderSource(int java.util.List ), (int)n, (List)((Object)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm17("of", of(java.lang.Object ), (Object)string)));
    }

    public static /* synthetic */ String \u0445pshj\u0458(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm19("glCompileShader", glCompileShader(int ), (int)n);
        return \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm20("glGetShaderi", glGetShaderi(int int ), (int)n, (int)(-1307138018 + 1307173731)) == false ? \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm21("glGetShaderInfoLog", glGetShaderInfoLog(int int ), (int)n, (int)(-1436415936 + 1436416448)) : null;
    }

    public static /* synthetic */ int ajo\u0455() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm22("glCreateProgram", glCreateProgram());
    }

    public static /* synthetic */ String e\u0440\u0440s\u0430(int n, int n2, int n3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm23("glAttachShader", glAttachShader(int int ), (int)n, (int)n2);
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm23("glAttachShader", glAttachShader(int int ), (int)n, (int)n3);
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm24("glLinkProgram", glLinkProgram(int ), (int)n);
        return \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm25("glGetProgrami", glGetProgrami(int int ), (int)n, (int)(-1953907770 + 1953943484)) == false ? \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm26("glGetProgramInfoLog", glGetProgramInfoLog(int int ), (int)n, (int)(-607534988 + 607535500)) : null;
    }

    public static /* synthetic */ void \u04bb\u0441j(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm27("_glUseProgram", _glUseProgram(int ), (int)n);
    }

    public static /* synthetic */ void oe\u0435p\u0445e(int n, int n2, int n3, int n4) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm28("_viewport", _viewport(int int int int ), (int)n, (int)n2, (int)n3, (int)n4);
    }

    public static /* synthetic */ int x\u0445ihh(int n, String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm29("_glGetUniformLocation", _glGetUniformLocation(int java.lang.CharSequence ), (int)n, (CharSequence)string);
    }

    public static /* synthetic */ void x\u0441ep(int n, int n2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm30("_glUniform1i", _glUniform1i(int int ), (int)n, (int)n2);
    }

    public static /* synthetic */ void \u0458\u0440p\u043e\u0456(int n, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm31("glUniform1f", glUniform1f(int float ), (int)n, (float)f);
    }

    public static /* synthetic */ void o\u0455j(int n, float f, float f2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm32("glUniform2f", glUniform2f(int float float ), (int)n, (float)f, (float)f2);
    }

    public static /* synthetic */ void e\u04bb\u0456cei(int n, float f, float f2, float f3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm33("glUniform3f", glUniform3f(int float float float ), (int)n, (float)f, (float)f2, (float)f3);
    }

    public static /* synthetic */ void \u0430ej(int n, float f, float f2, float f3, float f4) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm34("glUniform4f", glUniform4f(int float float float float ), (int)n, (float)f, (float)f2, (float)f3, (float)f4);
    }

    public static /* synthetic */ void \u0458a\u0455(int n, Matrix4f matrix4f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        matrix4f.get(hosp\u0441c);
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm35("_glUniformMatrix4", _glUniformMatrix4(int boolean java.nio.FloatBuffer ), (int)n, (boolean)false, (FloatBuffer)hosp\u0441c);
    }

    public static /* synthetic */ void cx\u0456(int n, int n2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm36("_pixelStore", _pixelStore(int int ), (int)n, (int)n2);
    }

    public static /* synthetic */ void \u0456\u0455\u0458(int n, int n2, int n3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm37("_texParameter", _texParameter(int int int ), (int)n, (int)n2, (int)n3);
    }

    public static /* synthetic */ void \u0440pc\u0441\u0441(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm38("glTexImage2D", glTexImage2D(int int int int int int int int java.nio.ByteBuffer ), (int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
    }

    public static /* synthetic */ void \u0441ca\u0455() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-537970225 + 537973537, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-1403203961 + 1403207274, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-1873739292 + 1873742606, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-2025005565 + 2025038443, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-1472009527 + 1472012842, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-970740815 + 970744131, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-148558966 + 148591843, 0);
        \u0458c\u0456\u0456\u0441\u0441\u0440.cx\u0456(-1689345166 + 1689348483, 4);
    }

    public static /* synthetic */ void \u0456\u0435je\u0435\u0441(int n, int n2, int n3, int n4, int n5) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm39("_glFramebufferTexture2D", _glFramebufferTexture2D(int int int int int ), (int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static /* synthetic */ void \u0430\u0435\u043ea(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm40("_clearColor", _clearColor(float float float float ), (float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm41("_clear", _clear(int boolean ), (int)n, (boolean)false);
    }

    public static /* synthetic */ void c\u0440\u043e() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm42("_enableDepthTest", _enableDepthTest());
    }

    public static /* synthetic */ void \u04bbxs() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm43("_disableDepthTest", _disableDepthTest());
    }

    public static /* synthetic */ void ecjs\u04bba\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm44("_enableBlend", _enableBlend());
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm45("_blendFunc", _blendFunc(int int ), (int)(-1781749635 + 1781750405), (int)(-229771587 + 229772358));
    }

    public static /* synthetic */ void sesoi\u04bb() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm46("_disableBlend", _disableBlend());
    }

    public static /* synthetic */ void \u0440\u0441hii\u04bb() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm47("_enableCull", _enableCull());
    }

    public static /* synthetic */ void h\u0456\u0441js\u0456() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm48("_disableCull", _disableCull());
    }

    public static /* synthetic */ void oajs\u0445() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm49("glEnable", glEnable(int ), (int)(-1582354910 + 1582357758));
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm50("glLineWidth", glLineWidth(float ), (float)1.0f);
    }

    public static /* synthetic */ void c\u04bbs\u0455() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm51("glDisable", glDisable(int ), (int)(-207714025 + 207716873));
    }

    public static /* synthetic */ void a\u043ei(int n, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm52("_activeTexture", _activeTexture(int ), (int)(-858902491 + 858936475 + n2));
        \u0458c\u0456\u0456\u0441\u0441\u0440.a_bsm53("_bindTexture", _bindTexture(int ), (int)n);
    }

    public static /* synthetic */ void \u04bb\u0430\u04bbae(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0458c\u0456\u0456\u0441\u0441\u0440.a\u043ei(n, 0);
    }

    static {
        hosp\u0441c = BufferUtils.createFloatBuffer((int)(-578804797 + 578804813));
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm2(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm3(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm4(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm5(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm6(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm7(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm8(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm9(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm10(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm11(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm12(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm13(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm14(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm15(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm16(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm17(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm18(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm19(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm20(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm21(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm22(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm23(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm24(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm25(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm26(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm27(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm28(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm29(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm30(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm31(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm32(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm33(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm34(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm35(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm36(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm37(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm38(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm39(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm40(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm41(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm42(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm43(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm44(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm45(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm46(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm47(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm48(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm49(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm50(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm51(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm52(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm53(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

