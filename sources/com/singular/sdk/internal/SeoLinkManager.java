package com.singular.sdk.internal;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class SeoLinkManager {
    private static SeoLinkManager instance;
    private Uri seoLink;

    public static SeoLinkManager getInstance() {
        if (instance == null) {
            instance = new SeoLinkManager();
        }
        return instance;
    }

    public void captureFromIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri == null) {
            String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
            if (!Utils.isEmptyOrNull(stringExtra)) {
                uri = Uri.parse(stringExtra);
            }
        }
        this.seoLink = uri;
    }

    public Uri consumeSeoLink() {
        Uri uri = this.seoLink;
        this.seoLink = null;
        return uri;
    }

    public boolean hasSeoLink() {
        return this.seoLink != null;
    }

    private SeoLinkManager() {
    }
}
