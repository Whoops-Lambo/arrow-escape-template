package com.adsurge.adn.p048o1;

import com.adsurge.adn.F.d;
import com.adsurge.adn.G.e;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements IDynamicScriptLifecycle {
    public final d a;
    public c b;

    public static a a(d dVar, com.adsurge.adn.u1.c cVar, g gVar) {
        try {
            if (dVar instanceof e) {
                return new a(dVar, cVar, gVar);
            }
            if (dVar instanceof com.adsurge.adn.F.a) {
                if (Boolean.TRUE.equals(((com.adsurge.adn.F.a) dVar).a("(typeof(GDTLifeCycle) === 'undefined' || GDTLifeCycle === null) && (typeof(GDTEventBus) === 'undefined' || GDTEventBus === null)"))) {
                    return null;
                }
                return new a(dVar, cVar, gVar);
            }
            return null;
        } catch (Throwable th) {
            g.a("typeof(GDTLifeCycle) === 'undefined' || GDTLifeCycle === null", com.adsurge.adn.W.a.a(cVar, gVar), th);
        }
    }

    public a(d dVar, com.adsurge.adn.u1.c cVar, g gVar) {
        this.a = dVar;
        this.b = com.adsurge.adn.W.a.a(cVar, gVar);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onAppBackground() {
        f.b().a("GDTLifeCycle", "onAppBackground", new Object[0]).d().a("event_onAppBackground", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onAppForeground() {
        f.b().a("GDTLifeCycle", "onAppForeground", new Object[0]).d().a("event_onAppForeground", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onBindData(JSONObject jSONObject) {
        f.b().a("GDTLifeCycle", "onBindData", jSONObject).d().a("event_onBindData", jSONObject).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onStartAnimation(String str) {
        f.b().a("GDTLifeCycle", "onStartAnimation", str).d().a("event_onStartAnimation", str).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onViewCreate() {
        f.b().a("GDTLifeCycle", "onViewCreate", new Object[0]).d().a("event_onViewCreate", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onViewDestroy() {
        f.b().a("GDTLifeCycle", "onViewDestroy", new Object[0]).d().a("event_onViewDestroy", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onWindowBlur() {
        f.b().a("event_onWindowBlur", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IDynamicScriptLifecycle
    public void onWindowFocus() {
        f.b().a("event_onWindowFocus", new Object[0]).c().a(this.a, this.b);
    }
}
