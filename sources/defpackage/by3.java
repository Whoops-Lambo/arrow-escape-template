package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhfd;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class by3 implements PackageManager$OnChecksumsReadyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ by3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onChecksumsReady(List list) {
        int i = this.a;
        Object obj = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                zzhfd zzhfdVar = (zzhfd) obj;
                if (list == null) {
                    zzhfdVar.e(null);
                } else {
                    try {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ApkChecksum apkChecksumD = kb3.d(list.get(i3));
                            if (apkChecksumD.getType() == 8) {
                                byte[] value = apkChecksumD.getValue();
                                char[] cArr = zzbcu.a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                while (i2 < value.length) {
                                    byte b = value[i2];
                                    int i4 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    char[] cArr3 = zzbcu.a;
                                    int i5 = i2 + i2;
                                    cArr2[i5] = cArr3[i4 >>> 4];
                                    cArr2[i5 + 1] = cArr3[b & 15];
                                    i2++;
                                }
                                zzhfdVar.e(new String(cArr2));
                            }
                            break;
                        }
                        zzhfdVar.e(null);
                    } catch (Throwable unused) {
                        zzhfdVar.e(null);
                        return;
                    }
                }
                break;
            default:
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) obj;
                if (list == null) {
                    completer.a("");
                } else {
                    try {
                        int size2 = list.size();
                        while (i2 < size2) {
                            ApkChecksum apkChecksumD2 = kb3.d(list.get(i2));
                            if (apkChecksumD2.getType() == 8) {
                                zzhbw zzhbwVarJ = zzhbw.c.j();
                                byte[] value2 = apkChecksumD2.getValue();
                                completer.a(zzhbwVarJ.f(value2.length, value2));
                            } else {
                                i2++;
                            }
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                    completer.a("");
                }
                break;
        }
    }
}
