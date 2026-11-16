package com.iab.omid.library.vungle.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b implements com.iab.omid.library.vungle.walking.async.b.InterfaceC0356b {
    private JSONObject a;
    private final com.iab.omid.library.vungle.walking.async.c b;

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0356b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void b() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0356b
    @VisibleForTesting
    public JSONObject a() {
        return this.a;
    }
}
