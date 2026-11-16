package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public final Data a(ArrayList arrayList) {
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.putAll(Collections.unmodifiableMap(((Data) obj).a));
        }
        builder.c(map);
        return builder.a();
    }
}
