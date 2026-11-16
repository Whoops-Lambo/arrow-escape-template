package com.singular.sdk.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler;
import com.singular.sdk.internal.InstallReferrer.SLInstallReferrerService;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class SLMetaReferrer implements SLInstallReferrerService {
    private static final SingularLog logger = SingularLog.getLogger("SLMetaReferrer");
    private static final String sourceName = "facebook";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerService
    public void fetchReferrer(Context context, SLInstallReferrerCompletionHandler sLInstallReferrerCompletionHandler) {
        Throwable th;
        Exception exc;
        Cursor cursorQuery;
        Uri uri;
        ?? r5 = 0;
        if (context == null) {
            logger.error("fetchReferrer: context is null, cannot fetch Meta referrer");
            sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
            return;
        }
        String str = SingularInstance.getInstance().getSingularConfig().facebookAppId;
        try {
            if (Utils.isEmptyOrNull(str)) {
                logger.debug("fetchReferrer: Facebook App ID is null or empty, skipping Meta referrer fetch");
                sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                return;
            }
            try {
                String[] strArr = {"install_referrer", "is_ct", "actual_timestamp"};
                if (context.getPackageManager().resolveContentProvider(Constants.FACEBOOK_CONTENT_URI_STRING, 0) != null) {
                    uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str);
                } else if (context.getPackageManager().resolveContentProvider(Constants.INSTAGRAM_CONTENT_URI_STRING, 0) == null) {
                    logger.debug("fetchReferrer: neither Facebook nor Instagram content provider found");
                    sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                    return;
                } else {
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str);
                }
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        logger.debug("fetchReferrer: cursor is null, no Meta referrer data available");
                        sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return;
                        }
                        return;
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        logger.debug("fetchReferrer: cursor is empty, no Meta referrer data available");
                        sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                        cursorQuery.close();
                        return;
                    }
                    int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                    int i = -1;
                    String string = (columnIndex == -1 || cursorQuery.getType(columnIndex) != 3) ? null : cursorQuery.getString(columnIndex);
                    int i2 = (columnIndex2 == -1 || cursorQuery.getType(columnIndex2) != 3) ? -1 : Integer.parseInt(cursorQuery.getString(columnIndex2));
                    if (columnIndex3 != -1 && cursorQuery.getType(columnIndex3) == 3) {
                        i = Integer.parseInt(cursorQuery.getString(columnIndex3));
                    }
                    HashMap map = new HashMap();
                    map.put("facebook_install_referrer", string);
                    map.put("facebook_actual_timestamp", Integer.valueOf(i2));
                    map.put("facebook_is_ct", Integer.valueOf(i));
                    sLInstallReferrerCompletionHandler.onInstallReferrerReceived(map);
                    cursorQuery.close();
                } catch (Exception e) {
                    exc = e;
                    logger.error("Failed to fetch Meta/Facebook referrer: " + Utils.formatException(exc));
                    sLInstallReferrerCompletionHandler.onInstallReferrerReceived(null);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Exception e2) {
                exc = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r5 == 0) {
                    throw th;
                }
                r5.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r5 = context;
        }
    }
}
