package io.p071bidmachine;

import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import io.p071bidmachine.utils.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class NetworkAdUnitManager {

    @NonNull
    private final AtomicBoolean isNetworkAuctionNotified;

    @NonNull
    private final List<NetworkAdUnit> networkAdUnitList;

    @NonNull
    private final i tag;

    @NonNull
    public NetworkAdUnit findOrAddWinnerNetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdsFormat adsFormat, @NonNull Map<String, String> map) {
        String str = map.get(ProtoExtConstants.AD_UNIT_ID);
        NetworkAdUnit networkAdUnit = null;
        if (!TextUtils.isEmpty(str)) {
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2.getId().equals(str)) {
                    networkAdUnit = networkAdUnit2;
                }
            }
        }
        if (networkAdUnit != null) {
            return networkAdUnit;
        }
        NetworkAdUnit networkAdUnit3 = new NetworkAdUnit(networkAdapter, adsFormat, map);
        this.networkAdUnitList.add(networkAdUnit3);
        return networkAdUnit3;
    }

    @NonNull
    @VisibleForTesting
    public List<NetworkAdUnit> getNetworkAdUnitList() {
        return this.networkAdUnitList;
    }

    public void notifyNetworkAuctionResult(@Nullable NetworkAdUnit networkAdUnit) {
        if (this.isNetworkAuctionNotified.compareAndSet(false, true)) {
            a.c(this.tag, "notifyNetworkAuctionResult");
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2 == networkAdUnit) {
                    try {
                        networkAdUnit2.onWinAuction();
                    } catch (Throwable unused) {
                    }
                } else {
                    networkAdUnit2.onLossAuction();
                }
            }
        }
    }

    public void notifyNetworkClearAuction() {
        if (this.networkAdUnitList.isEmpty()) {
            return;
        }
        a.c(this.tag, "notifyNetworkClearAuction");
        Iterator<NetworkAdUnit> it = this.networkAdUnitList.iterator();
        while (it.hasNext()) {
            try {
                it.next().clearAuction();
            } catch (Throwable unused) {
            }
        }
        this.networkAdUnitList.clear();
    }

    public void setNetworkAdUnitList(@Nullable List<NetworkAdUnit> list) {
        this.networkAdUnitList.clear();
        List<NetworkAdUnit> list2 = list;
        Handler handler = j.a;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.networkAdUnitList.addAll(list);
    }

    public NetworkAdUnitManager(@Nullable List<NetworkAdUnit> list) {
        this.tag = new i("NetworkAdUnitManager");
        this.isNetworkAuctionNotified = new AtomicBoolean(false);
        this.networkAdUnitList = new CopyOnWriteArrayList();
        setNetworkAdUnitList(list);
    }

    public NetworkAdUnitManager() {
        this(null);
    }
}
