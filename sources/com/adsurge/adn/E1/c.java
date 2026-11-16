package com.adsurge.adn.E1;

import android.net.Uri;
import android.text.TextUtils;
import com.adsurge.adn.X.C;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends AbstractC1626a {
    public c(p pVar, com.adsurge.adn.u1.c cVar) {
        super(pVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @Override // com.adsurge.adn.E1.AbstractC1626a
    public boolean a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!str.startsWith("https://play.google.com") && !str.startsWith("market://")) {
            if (C.a(uri)) {
                i = 2;
            } else {
                i = 3;
            }
        } else {
            String queryParameter = uri.getQueryParameter("id");
            if (!TextUtils.isEmpty(queryParameter)) {
                str = queryParameter;
                i = 1;
            } else {
                i = 3;
            }
        }
        com.adsurge.adn.u1.c cVar = this.b;
        if (cVar != null && !TextUtils.isEmpty(cVar.d())) {
            com.adsurge.adn.K1.c.a(this.b.d(), new com.adsurge.adn.K1.c.b(i, str));
        }
        return true;
    }
}
