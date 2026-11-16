package androidx.compose.runtime;

import defpackage.as0;
import defpackage.rc1;
import defpackage.sr0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0001j\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Landroidx/compose/runtime/KeyInfo;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class Pending$keyMap$2 extends rc1 implements sr0 {
    public final /* synthetic */ Pending i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(Pending pending) {
        super(0);
        this.i = pending;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        as0 as0Var = ComposerKt.a;
        HashMap map = new HashMap();
        ArrayList arrayList = this.i.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            KeyInfo keyInfo = (KeyInfo) arrayList.get(i);
            Object obj = keyInfo.b;
            int i2 = keyInfo.a;
            Object joinedKey = obj != null ? new JoinedKey(Integer.valueOf(i2), keyInfo.b) : Integer.valueOf(i2);
            Object linkedHashSet = map.get(joinedKey);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                map.put(joinedKey, linkedHashSet);
            }
            ((LinkedHashSet) linkedHashSet).add(keyInfo);
        }
        return map;
    }
}
