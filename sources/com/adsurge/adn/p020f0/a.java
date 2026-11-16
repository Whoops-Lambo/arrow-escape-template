package com.adsurge.adn.p020f0;

import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p038l0.i;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends d {
    @Override // com.adsurge.adn.p020f0.d
    public void a(c cVar) {
        try {
            ((com.adsurge.adn.p026h0.a) this.c).a(new JSONArray(this.b.a((g) cVar).toString()));
        } catch (JSONException unused) {
        }
    }

    public a(i iVar, c cVar, com.adsurge.adn.p026h0.a aVar) {
        super(iVar, cVar, aVar);
    }
}
