package com.adsurge.adn.B;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.X.p;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public volatile com.adsurge.adn.D.c a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends com.adsurge.adn.R.d {
        public final /* synthetic */ com.adsurge.adn.D.c a;
        public final /* synthetic */ File b;

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
            try {
                int iB = bVar.b();
                if (iB != 200) {
                    com.adsurge.adn.w1.b.c(6002000, null, Integer.valueOf(iB));
                    return;
                }
                String strC = bVar.c();
                if (TextUtils.isEmpty(strC)) {
                    com.adsurge.adn.w1.b.c(6002000, null, 1);
                    return;
                }
                com.adsurge.adn.D.c cVarA = com.adsurge.adn.D.a.a(strC);
                if (cVarA == null) {
                    com.adsurge.adn.w1.b.c(6002001, null, 1);
                } else if (this.a == null || c.a(cVarA.c(), this.a.c()) > 0) {
                    p.a(this.b, strC);
                }
            } catch (Throwable th) {
                com.adsurge.adn.w1.b.a(6002002, (com.adsurge.adn.Y0.c) null, new com.adsurge.adn.Y0.d().a(NotificationCompat.CATEGORY_MESSAGE, th.getMessage() != null ? th.getMessage() : th.getClass().getSimpleName()));
            }
        }

        public a(com.adsurge.adn.D.c cVar, File file) {
            this.a = cVar;
            this.b = file;
        }

        @Override // com.adsurge.adn.R.d
        public void a(com.adsurge.adn.H0.a aVar, int i, Exception exc) {
            com.adsurge.adn.w1.b.c(6002000, null, Integer.valueOf(i));
        }
    }

    public static String b(String str) {
        String strReplace = str.replace('+', '-').replace('/', '_');
        int length = strReplace.length();
        while (length > 0 && strReplace.charAt(length - 1) == '=') {
            length--;
        }
        return strReplace.substring(0, length);
    }

    public void a(String str) {
        Context contextA = com.adsurge.adn.J.a.d().a();
        if (contextA != null && !TextUtils.isEmpty(str)) {
            File file = new File(new File(contextA.getFilesDir(), StatisticData.ERROR_CODE_NOT_FOUND), StatisticData.ERROR_CODE_IO_ERROR);
            com.adsurge.adn.D.c cVarA = a(contextA);
            if (cVarA != null && b(cVarA.b()).equals(Uri.parse(str).getLastPathSegment())) {
                return;
            }
            com.adsurge.adn.R.c.a().a(new com.adsurge.adn.T.c(str, com.adsurge.adn.H0.a.EnumC0076a.GET, null), new a(cVarA, file));
        }
    }

    public final com.adsurge.adn.D.c a(File file) throws Throwable {
        String strA = p.a(file);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        com.adsurge.adn.D.c cVarA = com.adsurge.adn.D.a.a(strA);
        if (cVarA == null) {
            if (file != null && file.exists()) {
                file.delete();
            }
            com.adsurge.adn.w1.b.c(6002001, null, 1);
        }
        return cVarA;
    }

    public String a() {
        com.adsurge.adn.D.c cVarA;
        Context contextA = com.adsurge.adn.J.a.d().a();
        if (contextA == null || (cVarA = a(contextA)) == null) {
            return null;
        }
        return cVarA.a();
    }

    public final com.adsurge.adn.D.c a(Context context) {
        com.adsurge.adn.D.c cVar;
        com.adsurge.adn.D.c cVar2 = this.a;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = a(new File(new File(context.getFilesDir(), StatisticData.ERROR_CODE_NOT_FOUND), StatisticData.ERROR_CODE_IO_ERROR));
                }
                cVar = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static int a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            int i = 0;
            while (i < Math.max(strArrSplit.length, strArrSplit2.length)) {
                int iCompare = Integer.compare(i < strArrSplit.length ? Integer.parseInt(strArrSplit[i]) : 0, i < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i]) : 0);
                if (iCompare != 0) {
                    return iCompare;
                }
                i++;
            }
        }
        return 0;
    }
}
