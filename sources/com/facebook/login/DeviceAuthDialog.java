package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.ecffri.arrows.R;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.g0;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.s0;
import com.facebook.internal.v0;
import com.facebook.k0;
import com.facebook.l0;
import com.facebook.n0;
import com.facebook.o0;
import com.facebook.w0;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.h42;
import defpackage.lg0;
import defpackage.lz;
import defpackage.rl3;
import defpackage.s71;
import defpackage.xi;
import defpackage.y83;
import defpackage.yb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "com/facebook/login/w", "com/facebook/login/i", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DeviceAuthDialog extends DialogFragment {
    public View a;
    public TextView b;
    public TextView c;
    public DeviceAuthMethodHandler d;
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile l0 f;
    public volatile ScheduledFuture g;
    public volatile RequestState h;
    public boolean i;
    public boolean j;
    public LoginClient.Request k;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.i = true;
        this.e.set(true);
        super.onDestroyView();
        l0 l0Var = this.f;
        if (l0Var != null) {
            l0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RequestState> CREATOR = new j();
        public String a;
        public String b;
        public String c;
        public long d;
        public long e;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    public final void d(String str, i iVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.d().d(new LoginClient.Result(deviceAuthMethodHandler.d().g, 1, new AccessToken(str2, com.facebook.a0.b(), str, iVar.a, iVar.b, iVar.c, com.facebook.j.DEVICE_AUTH, date, null, date2, "facebook"), null, null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void f() {
        if (this.e.compareAndSet(false, true)) {
            RequestState requestState = this.h;
            if (requestState != null) {
                yb0.a(requestState.b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.d().d(new LoginClient.Result(deviceAuthMethodHandler.d().g, 2, null, null, "User canceled log in.", null));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void g(com.facebook.u uVar) {
        if (this.e.compareAndSet(false, true)) {
            RequestState requestState = this.h;
            if (requestState != null) {
                yb0.a(requestState.b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
            if (deviceAuthMethodHandler != null) {
                LoginClient.Request request = deviceAuthMethodHandler.d().g;
                String message = uVar.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                deviceAuthMethodHandler.d().d(new LoginClient.Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void h(long j, Long l, final String str) {
        Date date;
        Bundle bundleG = rl3.g("fields", "id,permissions,name");
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        final Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        AccessToken accessToken = new AccessToken(str, com.facebook.a0.b(), "0", null, null, null, null, date, null, date2, "facebook");
        final Date date3 = date;
        String str2 = k0.j;
        k0 k0VarM = com.explorestack.protobuf.adcom.c.m(accessToken, "me", new g0() { // from class: com.facebook.login.f
            @Override // com.facebook.g0
            public final void onCompleted(n0 n0Var) {
                final DeviceAuthDialog deviceAuthDialog = this.a;
                final String str3 = str;
                final Date date4 = date3;
                final Date date5 = date2;
                n0Var.getClass();
                if (deviceAuthDialog.e.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = n0Var.d;
                if (facebookRequestError != null) {
                    com.facebook.u uVar = facebookRequestError.i;
                    if (uVar == null) {
                        uVar = new com.facebook.u();
                    }
                    deviceAuthDialog.g(uVar);
                    return;
                }
                try {
                    JSONObject jSONObject = n0Var.b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    string.getClass();
                    final i iVarA = w.a(jSONObject);
                    String string2 = jSONObject.getString("name");
                    string2.getClass();
                    DeviceAuthDialog.RequestState requestState = deviceAuthDialog.h;
                    if (requestState != null) {
                        yb0.a(requestState.b);
                    }
                    f0 appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(com.facebook.a0.b());
                    if (!s71.b(appSettingsWithoutQuery != null ? Boolean.valueOf(appSettingsWithoutQuery.c.contains(s0.RequireConfirm)) : null, Boolean.TRUE) || deviceAuthDialog.j) {
                        deviceAuthDialog.d(string, iVarA, str3, date4, date5);
                        return;
                    }
                    deviceAuthDialog.j = true;
                    String string3 = deviceAuthDialog.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                    string3.getClass();
                    String string4 = deviceAuthDialog.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                    string4.getClass();
                    String string5 = deviceAuthDialog.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                    string5.getClass();
                    String str4 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                    AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.getContext());
                    builder.setMessage(string3).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.facebook.login.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            deviceAuthDialog.d(string, iVarA, str3, date4, date5);
                        }
                    }).setPositiveButton(string5, new DialogInterface.OnClickListener() { // from class: com.facebook.login.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DeviceAuthDialog deviceAuthDialog2 = deviceAuthDialog;
                            View viewE = deviceAuthDialog2.e(false);
                            Dialog dialog = deviceAuthDialog2.getDialog();
                            if (dialog != null) {
                                dialog.setContentView(viewE);
                            }
                            LoginClient.Request request = deviceAuthDialog2.k;
                            if (request != null) {
                                deviceAuthDialog2.l(request);
                            }
                        }
                    });
                    builder.create().show();
                } catch (JSONException e) {
                    deviceAuthDialog.g(new com.facebook.u(e));
                }
            }
        });
        k0VarM.h = o0.a;
        k0VarM.d = bundleG;
        k0VarM.d();
    }

    public final void i() {
        RequestState requestState = this.h;
        if (requestState != null) {
            requestState.e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.h;
        bundle.putString(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, requestState2 != null ? requestState2.c : null);
        StringBuilder sb = new StringBuilder();
        sb.append(com.facebook.a0.b());
        sb.append('|');
        v0.U();
        String str = com.facebook.a0.h;
        if (str == null) {
            com.facebook.appevents.p.e("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            return;
        }
        sb.append(str);
        bundle.putString("access_token", sb.toString());
        String str2 = k0.j;
        this.f = new k0(null, "device/login_status", bundle, o0.b, new e(this, 0), 32).d();
    }

    public final void j() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.h;
        Long lValueOf = requestState != null ? Long.valueOf(requestState.d) : null;
        if (lValueOf != null) {
            synchronized (DeviceAuthMethodHandler.d) {
                try {
                    if (DeviceAuthMethodHandler.e == null) {
                        DeviceAuthMethodHandler.e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = DeviceAuthMethodHandler.e;
                    if (scheduledThreadPoolExecutor == null) {
                        s71.D("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g = scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.facebook.login.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i();
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    public final void k(RequestState requestState) {
        Bitmap bitmapCreateBitmap;
        boolean zC;
        this.h = requestState;
        TextView textView = this.b;
        if (textView == null) {
            s71.D("confirmationCode");
            throw null;
        }
        textView.setText(requestState.b);
        String str = requestState.a;
        yb0 yb0Var = yb0.a;
        boolean z = false;
        if (lz.a.contains(yb0.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(lg0.class);
                enumMap.put(lg0.f, 2);
                try {
                    xi xiVarK = new h42(14).k(str, 12, enumMap);
                    int i = xiVarK.b;
                    int i2 = xiVarK.a;
                    int[] iArr = new int[i * i2];
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i3 * i2;
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i4 + i5] = xiVarK.a(i5, i3) ? -16777216 : -1;
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
                    } catch (y83 unused) {
                    }
                } catch (y83 unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th) {
                lz.a(yb0.class, th);
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
        TextView textView2 = this.c;
        if (textView2 == null) {
            s71.D("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.b;
        if (textView3 == null) {
            s71.D("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.a;
        if (view == null) {
            s71.D("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.j) {
            String str2 = requestState.b;
            if (lz.a.contains(yb0.class)) {
                zC = false;
            } else {
                try {
                    if (yb0.b()) {
                        zC = yb0.a.c(str2);
                    } else {
                        zC = false;
                    }
                } catch (Throwable th2) {
                    lz.a(yb0.class, th2);
                }
            }
            if (zC) {
                com.facebook.appevents.o oVar = new com.facebook.appevents.o(getContext(), (String) null);
                com.facebook.a0 a0Var = com.facebook.a0.a;
                if (w0.c()) {
                    oVar.h(null, "fb_smart_login_service");
                }
            }
        }
        if (requestState.e != 0 && (new Date().getTime() - requestState.e) - (requestState.d * 1000) < 0) {
            z = true;
        }
        if (z) {
            j();
        } else {
            i();
        }
    }

    public final View e(boolean z) {
        int i;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        if (z) {
            i = R.layout.com_facebook_smart_device_dialog_fragment;
        } else {
            i = R.layout.com_facebook_device_auth_dialog_fragment;
        }
        View viewInflate = layoutInflater.inflate(i, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        viewFindViewById.getClass();
        this.a = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.confirmation_code);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cancel_button);
        viewFindViewById3.getClass();
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f();
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.c = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public final void l(LoginClient.Request request) {
        request.getClass();
        this.k = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.b));
        v0.R("redirect_uri", bundle, request.i);
        v0.R("target_user_id", bundle, request.k);
        StringBuilder sb = new StringBuilder();
        sb.append(com.facebook.a0.b());
        sb.append('|');
        v0.U();
        String str = com.facebook.a0.h;
        if (str != null) {
            sb.append(str);
            bundle.putString("access_token", sb.toString());
            yb0 yb0Var = yb0.a;
            String str2 = null;
            if (!lz.a.contains(yb0.class)) {
                try {
                    HashMap map = new HashMap();
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    map.put(C4664b4.i.G, str3);
                    String str4 = Build.MODEL;
                    str4.getClass();
                    map.put(R6.B, str4);
                    String string = new JSONObject(map).toString();
                    string.getClass();
                    str2 = string;
                } catch (Throwable th) {
                    lz.a(yb0.class, th);
                }
            }
            bundle.putString("device_info", str2);
            String str5 = k0.j;
            new k0(null, "device/login", bundle, o0.b, new e(this, 1), 32).d();
            return;
        }
        com.facebook.appevents.p.e("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        k kVar = new k(requireActivity(), R.style.com_facebook_auth_dialog);
        if (yb0.b() && !this.j) {
            z = true;
        } else {
            z = false;
        }
        kVar.setContentView(e(z));
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoginMethodHandler loginMethodHandlerF;
        RequestState requestState;
        layoutInflater.getClass();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.getClass();
        r rVar = (r) ((FacebookActivity) fragmentActivityRequireActivity).b;
        if (rVar != null) {
            loginMethodHandlerF = rVar.c().f();
        } else {
            loginMethodHandlerF = null;
        }
        this.d = (DeviceAuthMethodHandler) loginMethodHandlerF;
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            k(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (!this.i) {
            f();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.h != null) {
            bundle.putParcelable("request_state", this.h);
        }
    }
}
