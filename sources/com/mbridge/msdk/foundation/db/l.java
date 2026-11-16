package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {
    private static l a;

    public synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i)});
                    if (cursorRawQuery != null) {
                        try {
                            try {
                                if (cursorRawQuery.getCount() > 0) {
                                    arrayList = new ArrayList(cursorRawQuery.getCount());
                                    while (cursorRawQuery.moveToNext()) {
                                        try {
                                            arrayList.add(new com.mbridge.msdk.foundation.entity.i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)), cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_CAMPAIGN_UNITID)), i));
                                        } catch (Exception e) {
                                            e = e;
                                            cursor = cursorRawQuery;
                                            e.printStackTrace();
                                            if (cursor != null) {
                                                cursorRawQuery = cursor;
                                                arrayList2 = arrayList;
                                                try {
                                                    cursorRawQuery.close();
                                                } catch (Exception unused) {
                                                }
                                            } else {
                                                arrayList2 = arrayList;
                                            }
                                        }
                                    }
                                    arrayList2 = arrayList;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                arrayList = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                arrayList = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList2;
    }

    private l(f fVar) {
        super(fVar);
    }

    public synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public synchronized void a(String str, String str2, int i) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
        contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str2);
        contentValues.put("ad_type", Integer.valueOf(i));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    public static l a(f fVar) {
        if (a == null) {
            synchronized (l.class) {
                try {
                    if (a == null) {
                        a = new l(fVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
