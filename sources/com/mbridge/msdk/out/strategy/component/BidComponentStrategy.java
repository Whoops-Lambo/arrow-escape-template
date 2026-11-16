package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import defpackage.bh;
import defpackage.q63;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class BidComponentStrategy extends BaseVideoComponentStrategy implements IBidVideoAdStrategy {
    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        try {
            if (com.mbridge.msdk.config.manager.a.c().e()) {
                return isReadyWithSyncWait(true);
            }
            return false;
        } catch (Exception e) {
            q63.s(e, new StringBuilder("ComponentBidStrategy isBidReady error: "), "BaseComponentStrategy", e);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    private void doLoadFromBid(String str) {
        this.bidToken = str;
        HashMap mapM = q63.m("bid_token", str);
        mapM.put("is_hb", 1);
        executeAsyncApiCall(com.mbridge.msdk.config.component.common.util.c.a(), "c1", mapM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFromBid$0(String str, Map map) {
        if (map == null || !String.valueOf(map.get("result")).equals("1")) {
            dispatchComponentCallback("loadFailed", new MBridgeIds(this.placementId, this.unitId), "Unable to load");
        } else {
            doLoadFromBid(str);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        try {
            HashMap map = new HashMap();
            map.put("user_id", this.userId);
            map.put("user_extra_data", this.extraData);
            map.put("bid_token", this.bidToken);
            map.put("is_hb", 1);
            executeAsyncApiCall(com.mbridge.msdk.config.component.common.util.c.a(), "c2", map);
        } catch (Exception e) {
            q63.s(e, new StringBuilder("ComponentBidStrategy showFromBid error: "), "BaseComponentStrategy", e);
        }
    }

    public BidComponentStrategy(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        try {
            if (!com.mbridge.msdk.config.manager.a.c().e()) {
                com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.r, new bh(this, str, 1));
            } else {
                doLoadFromBid(str);
            }
        } catch (Exception e) {
            q63.s(e, new StringBuilder("ComponentBidStrategy loadFromBid error: "), "BaseComponentStrategy", e);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        this.userId = str;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }
}
