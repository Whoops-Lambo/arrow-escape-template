package com.iab.omid.library.appodeal.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.walking.async.d;
import com.iab.omid.library.appodeal.walking.async.e;
import com.iab.omid.library.appodeal.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b implements com.iab.omid.library.appodeal.walking.async.b.InterfaceC0323b {
    private JSONObject a;
    private final com.iab.omid.library.appodeal.walking.async.c b;

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    public b(com.iab.omid.library.appodeal.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0323b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void b() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0323b
    @VisibleForTesting
    public JSONObject a() {
        return this.a;
    }
}
