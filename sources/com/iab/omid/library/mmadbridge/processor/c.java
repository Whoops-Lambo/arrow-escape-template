package com.iab.omid.library.mmadbridge.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.utils.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c implements a {
    private final a a;

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.mmadbridge.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewC = it.next().c();
                if (viewC != null && h.g(viewC) && (rootView = viewC.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public c(a aVar) {
        this.a = aVar;
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.mmadbridge.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0342a interfaceC0342a, boolean z, boolean z2) {
        ArrayList<View> arrayListA = a();
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            View view2 = arrayListA.get(i);
            i++;
            interfaceC0342a.a(view2, this.a, jSONObject, z2);
        }
    }
}
