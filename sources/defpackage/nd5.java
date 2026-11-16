package defpackage;

import com.google.android.gms.internal.measurement.zzaaa;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzj;
import com.google.android.gms.internal.measurement.zzzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nd5 extends zzaaa {
    public final Map b;

    public static void d(LinkedHashMap linkedHashMap, zzzj zzzjVar) {
        for (int i = 0; i < zzzjVar.a(); i++) {
            zzyl zzylVarB = zzzjVar.b(i);
            Object obj = linkedHashMap.get(zzylVarB);
            boolean z = zzylVarB.c;
            Class cls = zzylVarB.b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zzylVarB, arrayList);
                }
                arrayList.add(cls.cast(zzzjVar.c(i)));
            } else {
                linkedHashMap.put(zzylVarB, cls.cast(zzzjVar.c(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void a(zzzq zzzqVar, zzzc zzzcVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            zzyl zzylVar = (zzyl) entry.getKey();
            Object value = entry.getValue();
            if (zzylVar.c) {
                zzzqVar.b(zzylVar, ((List) value).iterator(), zzzcVar);
            } else {
                zzzqVar.a(zzylVar, value, zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int b() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set c() {
        return this.b.keySet();
    }

    public nd5(zzzj zzzjVar, zzzj zzzjVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, zzzjVar);
        d(linkedHashMap, zzzjVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzyl) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }
}
