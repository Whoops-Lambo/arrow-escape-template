package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C4950r4;
import com.ironsource.InterfaceC5025v7;
import com.ironsource.InterfaceC5043w7;
import com.ironsource.Y3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class BroadcastReceiverStrategy implements InterfaceC5025v7 {
    private final InterfaceC5043w7 a;
    private BroadcastReceiver b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = Y3.b(context);
            boolean zEquals = strB.equals("none");
            BroadcastReceiverStrategy broadcastReceiverStrategy = BroadcastReceiverStrategy.this;
            if (zEquals) {
                broadcastReceiverStrategy.a.a();
            } else {
                broadcastReceiverStrategy.a.a(strB, IronSourceNetworkBridge.jsonObjectInit());
            }
        }
    };

    @Override // com.ironsource.InterfaceC5025v7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException e) {
            C4950r4.d().a(e);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    @Override // com.ironsource.InterfaceC5025v7
    public void b(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public BroadcastReceiverStrategy(InterfaceC5043w7 interfaceC5043w7) {
        this.a = interfaceC5043w7;
    }

    @Override // com.ironsource.InterfaceC5025v7
    public JSONObject c(Context context) {
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    @Override // com.ironsource.InterfaceC5025v7
    public void a() {
        this.b = null;
    }
}
