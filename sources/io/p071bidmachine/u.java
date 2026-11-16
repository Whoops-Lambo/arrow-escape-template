package io.p071bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import io.p071bidmachine.core.a;
import io.p071bidmachine.util.p;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u {
    public static final String a = UUID.randomUUID().toString();
    public static final ArrayList b;
    public static q c;
    public static AdvertisingDataManager$AdvertisingData d;
    public static String e;

    public static String a(Context context) {
        AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingData = d;
        String id = advertisingDataManager$AdvertisingData != null ? advertisingDataManager$AdvertisingData.getId() : null;
        if (!TextUtils.isEmpty(id) && !"00000000-0000-0000-0000-000000000000".equals(id)) {
            return id;
        }
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ad_core_preferences", 0);
        String strH = p.H(sharedPreferences, "uuid");
        e = strH;
        if (!TextUtils.isEmpty(strH)) {
            return e;
        }
        e = a;
        sharedPreferences.edit().putString("uuid", e).apply();
        return e;
    }

    public static void b(Context context) {
        AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingDataA;
        q qVar = c;
        AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingDataA2 = null;
        if (qVar != null) {
            AtomicBoolean atomicBoolean = qVar.a;
            if (atomicBoolean.get()) {
                try {
                    advertisingDataManager$AdvertisingDataA2 = qVar.a(context);
                } catch (NoClassDefFoundError e2) {
                    atomicBoolean.set(false);
                    a.i(e2);
                } catch (Throwable th) {
                    a.i(th);
                }
            }
            if (advertisingDataManager$AdvertisingDataA2 != null) {
                d = advertisingDataManager$AdvertisingDataA2;
                return;
            }
            return;
        }
        ArrayList arrayList = b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            q qVar2 = (q) obj;
            AtomicBoolean atomicBoolean2 = qVar2.a;
            if (atomicBoolean2.get()) {
                try {
                    advertisingDataManager$AdvertisingDataA = qVar2.a(context);
                } catch (NoClassDefFoundError e3) {
                    atomicBoolean2.set(false);
                    a.i(e3);
                    advertisingDataManager$AdvertisingDataA = null;
                } catch (Throwable th2) {
                    a.i(th2);
                    advertisingDataManager$AdvertisingDataA = null;
                }
            } else {
                advertisingDataManager$AdvertisingDataA = null;
            }
            if (advertisingDataManager$AdvertisingDataA != null) {
                c = qVar2;
                d = advertisingDataManager$AdvertisingDataA;
                return;
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        b = arrayList;
        arrayList.add(new s());
        arrayList.add(new t());
    }
}
