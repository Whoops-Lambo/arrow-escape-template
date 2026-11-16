package io.p071bidmachine.util.log;

import android.util.Log;
import com.ironsource.C4664b4;
import defpackage.dk2;
import defpackage.sr0;
import io.p071bidmachine.util.r;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a implements b {
    public final String a;
    public boolean b = true;

    @Override // io.p071bidmachine.util.log.b
    public final void b(Object obj, r rVar) {
        f(this, 5, obj, rVar, null, 8);
    }

    @Override // io.p071bidmachine.util.log.b
    public final void c(Object obj, sr0 sr0Var) {
        f(this, 3, obj, sr0Var, null, 8);
    }

    @Override // io.p071bidmachine.util.log.b
    public final void d(Object obj, sr0 sr0Var) {
        f(this, 6, obj, sr0Var, null, 8);
    }

    public static void f(a aVar, int i, Object obj, sr0 sr0Var, Throwable th, int i2) {
        if ((i2 & 4) != 0) {
            sr0Var = null;
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        if (aVar.e(i)) {
            StringBuilder sb = new StringBuilder();
            if (obj != null) {
                sb.append(C4664b4.j.d + obj + "] ");
            }
            if (sr0Var != null) {
                sb.append((String) sr0Var.invoke());
            }
            int i3 = 0;
            if (th != null) {
                if (!dk2.Z(sb)) {
                    sb.append("\n");
                }
                StringWriter stringWriter = new StringWriter(256);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                sb.append(string);
            }
            String string2 = sb.toString();
            String str = aVar.a;
            if (string2.length() <= 1000) {
                Log.println(i, str, string2);
                return;
            }
            int length = (string2.length() + 999) / 1000;
            int i4 = 0;
            while (i3 < length) {
                int i5 = i4 + 1000;
                Log.println(i, str, string2.substring(i4, Math.min(string2.length(), i5)));
                i3++;
                i4 = i5;
            }
        }
    }

    public boolean e(int i) {
        return this.b;
    }

    public a(String str) {
        this.a = str;
    }
}
