package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import defpackage.ch;
import defpackage.q63;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ComponentStrategy extends BaseVideoComponentStrategy implements IVideoAdStrategy {
    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public boolean isReady() {
        try {
            if (com.mbridge.msdk.config.manager.a.c().e()) {
                return isReadyWithSyncWait(false);
            }
            return false;
        } catch (Exception e) {
            q63.s(e, new StringBuilder("ComponentBidStrategy isBidReady error: "), "BaseComponentStrategy", e);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    private void doLoad() {
        HashMap mapM = q63.m("bid_token", "");
        mapM.put("is_hb", 0);
        executeAsyncApiCall(com.mbridge.msdk.config.component.common.util.c.a(), "c1", mapM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Map map) {
        if (map == null || !String.valueOf(map.get("result")).equals("1")) {
            dispatchComponentCallback("loadFailed", new MBridgeIds(this.placementId, this.unitId), "Unable to load");
        } else {
            doLoad();
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show() {
        HashMap map = new HashMap();
        map.put("user_id", this.userId);
        map.put("user_extra_data", this.extraData);
        map.put("is_hb", 0);
        executeAsyncApiCall(com.mbridge.msdk.config.component.common.util.c.a(), "c2", map);
    }

    public ComponentStrategy(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void load() {
        if (!com.mbridge.msdk.config.manager.a.c().e()) {
            com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.r, new ch(this, 1));
        } else {
            doLoad();
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str) {
        this.userId = str;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }
}
