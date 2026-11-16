package com.mbridge.msdk.video.dynview.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.listener.e;
import com.mbridge.msdk.video.dynview.listener.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static boolean a;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C1497a implements e {
        final /* synthetic */ h a;

        public C1497a(h hVar) {
            this.a = hVar;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.e
        public void a(View view, List<View> list) {
            com.mbridge.msdk.video.dynview.a aVar = new com.mbridge.msdk.video.dynview.a();
            aVar.a(view);
            aVar.a(list);
            aVar.a(a.a);
            this.a.a(aVar);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.e
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            this.a.a(aVar);
        }
    }

    private void a(c cVar, h hVar, Map<String, Object> map) {
        View viewInflate;
        if (hVar == null) {
            return;
        }
        if (cVar == null) {
            hVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (cVar.c() == null) {
            hVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(cVar.f())) {
            hVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_LAYOUTNAME);
            return;
        }
        try {
            if (cVar.d() != null) {
                viewInflate = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx((cVar.b() == null || cVar.b().size() <= 0) ? null : cVar.b().get(0)).fileDirs(cVar.d()).dyAdType(DyAdType.REWARD).orientation(cVar.h()).templateType(cVar.g()).build());
                if (viewInflate != null) {
                    a = true;
                } else {
                    a = false;
                    viewInflate = LayoutInflater.from(cVar.c()).inflate(i0.a(cVar.c(), cVar.f(), "layout"), (ViewGroup) null);
                }
            } else {
                a = false;
                viewInflate = LayoutInflater.from(cVar.c()).inflate(i0.a(cVar.c(), cVar.f(), "layout"), (ViewGroup) null);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("is_dy_success", Boolean.valueOf(a));
            com.mbridge.msdk.video.dynview.energize.b.a().a(viewInflate, cVar, map);
            com.mbridge.msdk.video.dynview.energize.a.a().a(viewInflate, cVar, map, new C1497a(hVar));
        } catch (Exception e) {
            q0.b("MBridgeUI", e.getMessage());
            hVar.a(com.mbridge.msdk.video.dynview.error.a.VIEW_CREATE_ERROR);
        }
    }

    public a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        a(new com.mbridge.msdk.video.dynview.wrapper.c().a(context, list), hVar, map);
    }

    public a(c cVar, h hVar, Map<String, Object> map) {
        a(cVar, hVar, map);
    }
}
