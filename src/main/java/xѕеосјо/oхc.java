/*
 * Decompiled with CFR 0.152.
 */
package x\u0455\u0435\u043e\u0441\u0458\u043e;

import androidx.graphics.shapes.Cubic;
import androidx.graphics.shapes.RoundedPolygon;
import io.github.humbleui.skija.Path;
import java.util.List;
import r.d3.C1a946c5246ca0949bfd0e13d;

public class o\u0445c {
    public o\u0445c() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public static /* synthetic */ void pj\u04bbhhis(RoundedPolygon roundedPolygon, Path path, float f, float f2, float f3, float f4) {
        List list;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((list = roundedPolygon.getCubics()).isEmpty()) {
            return;
        }
        float f5 = roundedPolygon.getCenterX();
        float f6 = roundedPolygon.getCenterY();
        Cubic cubic = (Cubic)list.get(0);
        path.moveTo(f + (cubic.getAnchor0X() - f5) * f3 + f3 / 2.0f, f2 + (cubic.getAnchor0Y() - f6) * f4 + f4 / 2.0f);
        block4: for (Cubic cubic2 : list) {
            path.cubicTo(f + (cubic2.getControl0X() - f5) * f3 + f3 / 2.0f, f2 + (cubic2.getControl0Y() - f6) * f4 + f4 / 2.0f, f + (cubic2.getControl1X() - f5) * f3 + f3 / 2.0f, f2 + (cubic2.getControl1Y() - f6) * f4 + f4 / 2.0f, f + (cubic2.getAnchor1X() - f5) * f3 + f3 / 2.0f, f2 + (cubic2.getAnchor1Y() - f6) * f4 + f4 / 2.0f);
            switch (0) {
                default: {
                    continue block4;
                }
                case 1: {
                    continue block4;
                }
                case 2: 
            }
        }
        path.closePath();
    }

    public static /* synthetic */ void sp\u0445cx(RoundedPolygon roundedPolygon, Path path, float f, float f2, float f3, float f4) {
        RoundedPolygon roundedPolygon2;
        List list;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((list = (roundedPolygon2 = roundedPolygon.normalized()).getCubics()).isEmpty()) {
            return;
        }
        Cubic cubic = (Cubic)list.get(0);
        path.moveTo(f + cubic.getAnchor0X() * f3, f2 + cubic.getAnchor0Y() * f4);
        for (Cubic cubic2 : list) {
            path.cubicTo(f + cubic2.getControl0X() * f3, f2 + cubic2.getControl0Y() * f4, f + cubic2.getControl1X() * f3, f2 + cubic2.getControl1Y() * f4, f + cubic2.getAnchor1X() * f3, f2 + cubic2.getAnchor1Y() * f4);
        }
        path.closePath();
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

