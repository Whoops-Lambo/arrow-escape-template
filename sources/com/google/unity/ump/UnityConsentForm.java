package com.google.unity.ump;

import android.app.Activity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class UnityConsentForm {
    private final Activity activity;
    private final UnityConsentFormCallback callback;
    private final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = new AnonymousClass1(this);

    /* JADX INFO: renamed from: com.google.unity.ump.UnityConsentForm$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements ConsentForm.OnConsentFormDismissedListener {
        final /* synthetic */ UnityConsentForm this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConsentFormDismissed$0(FormError formError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onConsentFormDismissed(formError);
            }
        }

        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
        public void onConsentFormDismissed(final FormError formError) {
            new Thread(new Runnable() { // from class: com.google.unity.ump.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onConsentFormDismissed$0(formError);
                }
            }).start();
        }

        public AnonymousClass1(UnityConsentForm unityConsentForm) {
            Objects.requireNonNull(unityConsentForm);
            this.this$0 = unityConsentForm;
        }
    }

    public void loadAndShowConsentFormIfRequired() {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(this.activity, this.onConsentFormDismissedListener);
    }

    public void show(ConsentForm consentForm) {
        consentForm.show(this.activity, this.onConsentFormDismissedListener);
    }

    public void showPrivacyOptionsForm() {
        UserMessagingPlatform.showPrivacyOptionsForm(this.activity, this.onConsentFormDismissedListener);
    }

    public UnityConsentForm(Activity activity, UnityConsentFormCallback unityConsentFormCallback) {
        this.activity = activity;
        this.callback = unityConsentFormCallback;
    }
}
