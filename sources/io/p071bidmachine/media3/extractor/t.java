package io.p071bidmachine.media3.extractor;

import io.p071bidmachine.media3.common.c0;
import io.p071bidmachine.media3.common.d0;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.metadata.id3.e;
import io.p071bidmachine.media3.extractor.metadata.id3.k;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class t {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final void b(d0 d0Var) {
        int i = 0;
        while (true) {
            c0[] c0VarArr = d0Var.a;
            if (i >= c0VarArr.length) {
                return;
            }
            c0 c0Var = c0VarArr[i];
            if (c0Var instanceof e) {
                e eVar = (e) c0Var;
                if ("iTunSMPB".equals(eVar.c) && a(eVar.d)) {
                    return;
                }
            } else if (c0Var instanceof k) {
                k kVar = (k) c0Var;
                if ("com.apple.iTunes".equals(kVar.b) && "iTunSMPB".equals(kVar.c) && a(kVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = x.a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
