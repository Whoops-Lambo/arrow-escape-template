package com.singular.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.singular.sdk.internal.SingularLog;
import com.singular.sdk.internal.Utils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class SingularInstallReceiver extends BroadcastReceiver {
    private static final SingularLog logger = SingularLog.getLogger(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Utils.isEmptyOrNull(action)) {
            logger.debug("Install.onReceive() action is empty");
            return;
        }
        if (!action.equals("com.android.vending.INSTALL_REFERRER")) {
            logger.debug("Install.onReceive() unknown action = %s", action);
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        if (!Utils.isEmptyOrNull(stringExtra)) {
            Utils.saveCSIReferrer(context, stringExtra);
            logger.debug("saved referrer = %s", stringExtra);
        }
    }
}
