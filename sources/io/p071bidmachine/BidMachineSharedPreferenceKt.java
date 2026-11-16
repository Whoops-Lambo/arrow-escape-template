package io.p071bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import defpackage.du;
import io.p071bidmachine.internal.r;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0010J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0013J\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/bidmachine/BidMachineSharedPreferenceKt;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "ttlSessionCount", "", "obtainBMIFV", "(Landroid/content/Context;I)Ljava/lang/String;", "generateBMIFV", "", "hasBMIFV", "(Landroid/content/Context;)Z", "getBMIFVTtlSessionCountRemaining", "(Landroid/content/Context;)I", "Laz2;", "setBMIFVTtlSessionCountRemaining", "(Landroid/content/Context;I)V", "count", "increaseBMIFVTtlSessionCountRemaining", "decreaseBMIFVTtlSessionCountRemaining", "getLastBMIFVTtlSessionCount", "setLastBMIFVTtlSessionCount", "", "sdkInstallTime", "setSdkInstallTime", "(Landroid/content/Context;J)V", "getSdkInstallTime", "(Landroid/content/Context;)J", "Lio/bidmachine/internal/r;", "versionMilestone", "setCurrentVersionMilestone", "(Landroid/content/Context;Lio/bidmachine/internal/r;)V", "getCurrentVersionMilestone", "(Landroid/content/Context;)Lio/bidmachine/internal/r;", "", "historyVersionMilestoneList", "setHistoryVersionMilestoneList", "(Landroid/content/Context;Ljava/util/List;)V", "getHistoryVersionMilestoneList", "(Landroid/content/Context;)Ljava/util/List;", "clear", "(Landroid/content/Context;)V", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BidMachineSharedPreferenceKt {

    @NotNull
    public static final BidMachineSharedPreferenceKt INSTANCE = new BidMachineSharedPreferenceKt();

    public static /* synthetic */ void decreaseBMIFVTtlSessionCountRemaining$default(BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        bidMachineSharedPreferenceKt.decreaseBMIFVTtlSessionCountRemaining(context, i);
    }

    public static /* synthetic */ void increaseBMIFVTtlSessionCountRemaining$default(BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        bidMachineSharedPreferenceKt.increaseBMIFVTtlSessionCountRemaining(context, i);
    }

    private BidMachineSharedPreferenceKt() {
    }

    @VisibleForTesting
    public final void clear(Context context) {
        context.getClass();
        SharedPreferences sharedPreferencesA = c.a(context);
        sharedPreferencesA.getClass();
        for (String str : sharedPreferencesA.getAll().keySet()) {
            str.getClass();
            p.R(sharedPreferencesA, str);
        }
    }

    public final void decreaseBMIFVTtlSessionCountRemaining(Context context, int count) {
        int i;
        context.getClass();
        if (count == 0 || (i = c.a(context).getInt("bid_machine_ifv_ttl_session_count_remaining", 0)) <= 0) {
            return;
        }
        p.M(c.a(context), "bid_machine_ifv_ttl_session_count_remaining", Integer.valueOf(Math.max(Math.max(i - count, 0), 0)));
    }

    public final String generateBMIFV(Context context, int ttlSessionCount) {
        context.getClass();
        String string = UUID.randomUUID().toString();
        SharedPreferences sharedPreferencesA = c.a(context);
        sharedPreferencesA.getClass();
        try {
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.getClass();
            if (string == null) {
                editorEdit.remove("bid_machine_ifv");
            } else {
                editorEdit.putString("bid_machine_ifv", string);
            }
            editorEdit.putInt("bid_machine_ifv_ttl_session_count_remaining", ttlSessionCount);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
        string.getClass();
        return string;
    }

    public final int getBMIFVTtlSessionCountRemaining(Context context) {
        context.getClass();
        return c.a(context).getInt("bid_machine_ifv_ttl_session_count_remaining", 0);
    }

    public final r getCurrentVersionMilestone(Context context) {
        context.getClass();
        String strH = p.H(c.a(context), "current_version_milestone");
        if (!TextUtils.isEmpty(strH)) {
            try {
                return d.d(new JSONObject(strH));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final List getHistoryVersionMilestoneList(Context context) {
        List listZ0;
        r rVarD;
        context.getClass();
        String strH = p.H(c.a(context), "history_version_milestone_list");
        if (TextUtils.isEmpty(strH)) {
            listZ0 = Collections.EMPTY_LIST;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(strH);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (rVarD = d.d(jSONObjectOptJSONObject)) != null) {
                        arrayList.add(rVarD);
                    }
                }
                listZ0 = du.z0(arrayList);
            } catch (Throwable unused) {
                listZ0 = Collections.EMPTY_LIST;
            }
        }
        listZ0.getClass();
        return listZ0;
    }

    public final int getLastBMIFVTtlSessionCount(Context context) {
        context.getClass();
        return c.a(context).getInt("bid_machine_ifv_last_ttl_session_count", 0);
    }

    public final long getSdkInstallTime(Context context) {
        context.getClass();
        return p.G(c.a(context), "sdk_install_time", 0L);
    }

    public final boolean hasBMIFV(Context context) {
        context.getClass();
        return c.a(context).contains("bid_machine_ifv");
    }

    public final void increaseBMIFVTtlSessionCountRemaining(Context context, int count) {
        context.getClass();
        if (count == 0) {
            return;
        }
        p.M(c.a(context), "bid_machine_ifv_ttl_session_count_remaining", Integer.valueOf(Math.max(c.a(context).getInt("bid_machine_ifv_ttl_session_count_remaining", 0) + count, 0)));
    }

    public final String obtainBMIFV(Context context, int ttlSessionCount) {
        context.getClass();
        String strH = p.H(c.a(context), "bid_machine_ifv");
        if (TextUtils.isEmpty(strH)) {
            strH = UUID.randomUUID().toString();
            SharedPreferences sharedPreferencesA = c.a(context);
            sharedPreferencesA.getClass();
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                editorEdit.getClass();
                if (strH == null) {
                    editorEdit.remove("bid_machine_ifv");
                } else {
                    editorEdit.putString("bid_machine_ifv", strH);
                }
                editorEdit.putInt("bid_machine_ifv_ttl_session_count_remaining", ttlSessionCount);
                editorEdit.apply();
            } catch (Throwable unused) {
            }
        }
        strH.getClass();
        return strH;
    }

    public final void setBMIFVTtlSessionCountRemaining(Context context, int ttlSessionCount) {
        context.getClass();
        p.M(c.a(context), "bid_machine_ifv_ttl_session_count_remaining", Integer.valueOf(Math.max(ttlSessionCount, 0)));
    }

    public final void setCurrentVersionMilestone(Context context, r versionMilestone) {
        String string;
        context.getClass();
        if (versionMilestone != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", versionMilestone.a.toString());
            jSONObject.put("scn", versionMilestone.b);
            jSONObject.put("fst", versionMilestone.c);
            jSONObject.put("lst", versionMilestone.d);
            jSONObject.put("csd", versionMilestone.e);
            jSONObject.put("lsd", versionMilestone.f);
            string = jSONObject.toString();
        } else {
            string = null;
        }
        p.P(c.a(context), "current_version_milestone", string);
    }

    public final void setHistoryVersionMilestoneList(Context context, List historyVersionMilestoneList) {
        context.getClass();
        historyVersionMilestoneList.getClass();
        if (historyVersionMilestoneList.isEmpty()) {
            p.R(c.a(context), "history_version_milestone_list");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = historyVersionMilestoneList.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            rVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", rVar.a.toString());
            jSONObject.put("scn", rVar.b);
            jSONObject.put("fst", rVar.c);
            jSONObject.put("lst", rVar.d);
            jSONObject.put("csd", rVar.e);
            jSONObject.put("lsd", rVar.f);
            jSONArray.put(jSONObject);
        }
        p.P(c.a(context), "history_version_milestone_list", jSONArray.toString());
    }

    public final void setLastBMIFVTtlSessionCount(Context context, int ttlSessionCount) {
        context.getClass();
        p.M(c.a(context), "bid_machine_ifv_last_ttl_session_count", Integer.valueOf(Math.max(ttlSessionCount, 0)));
    }

    public final void setSdkInstallTime(Context context, long sdkInstallTime) {
        context.getClass();
        p.O(c.a(context), "sdk_install_time", Long.valueOf(sdkInstallTime));
    }
}
