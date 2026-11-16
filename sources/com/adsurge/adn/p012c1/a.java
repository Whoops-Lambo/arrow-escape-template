package com.adsurge.adn.p012c1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.p021f1.o;
import com.adsurge.adn.w1.b;
import defpackage.a20;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.adsurge.adn.c1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0103a {
        void a(boolean z);
    }

    public static boolean a(Context context, File file, c cVar, InterfaceC0103a interfaceC0103a) {
        if (context == null || file == null || !file.exists() || file.length() == 0) {
            if (file != null) {
                file.getAbsolutePath();
            }
            a(interfaceC0103a, false);
            return false;
        }
        file.getName();
        if (Build.VERSION.SDK_INT >= 26 && !c.c()) {
            com.adsurge.adn.p009b1.a.a().a(cVar, new a20(context, file, cVar, interfaceC0103a, 4));
            return true;
        }
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".adsurge.fileprovider", file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            boolean zB = o.b(context, intent);
            a(interfaceC0103a, zB);
            return zB;
        } catch (Throwable unused) {
            a(interfaceC0103a, false);
            return false;
        }
    }

    public static /* synthetic */ void a(Context context, File file, c cVar, InterfaceC0103a interfaceC0103a, boolean z) {
        if (z) {
            a(context, file, cVar, interfaceC0103a);
        } else {
            b.a(6001806, cVar);
            a(interfaceC0103a, false);
        }
    }

    public static void a(InterfaceC0103a interfaceC0103a, boolean z) {
        if (interfaceC0103a != null) {
            interfaceC0103a.a(z);
        }
    }
}
