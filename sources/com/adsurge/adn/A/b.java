package com.adsurge.adn.A;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static PublicKey a;
    public static PublicKey b;
    public static PublicKey c;

    public static PublicKey a(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static PublicKey b() {
        if (c == null) {
            c = a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAub4VZLJ3SBnU2QHj1lu5ul8vMOTSQH82tQMaw3H5u/ea0vsH0YHiNVN03HR+g8+VPjAx60f3wqHnORFkBnovQtZYMNBSZGHwcoIUqBGcOp3pAGv7foyOCu/To2Z764RkaJlJMQdhFAXAFwUCPPxOTCT9M8gX08Mi0tvSNRcD/uIfm6//XtdouH/S9AKCsmO1LWHZQ3leeSNOpu13rcuVVqq5sXrZ6mDzdBHQDbSkN7/2KwqDEH+MFmWi30swD0yHu8g+Nvs2O4wXTlw9RhZHZluergRJHCg8kYn01aMqgXxWaWwdfEGtHrE+O+Ih/NXGs9NZr97OVc/frtjApjtb1wIDAQAB");
        }
        return c;
    }

    public static PublicKey c() {
        if (b == null) {
            b = a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApNhii5dwL1cyJ/jeHKZ7yu119Bg6xBvg1wPoKlwJsNi5rljSBswgEd0KLXMSGGL1DJwBo6Ao1JebZgFz2Y6iWu9jCbUTmWCPmDHvbK8JqbqRMdXeKF047EtxxyFZVapCf3dMGDLAkLQD62D/Fj95iVQ8JLSeqP7MRaatJGqVOQqDyWghz8yW20XJSgNQXtBub5yH5nbV+US/3ZGqWZDVgwgefgLeNy7kjpGmKkrAyO5oQ/02z1rxa+nVXmc2pDGn7b9wlDwK3XApnCumjdw2qeJlKiJWPCwtFy4rbP5R8DcUzxQYtPFDsjuKn9bZZLWn86u/44kv8/2FF+QK/Whz+wIDAQAB");
        }
        return b;
    }

    public static PublicKey a() {
        if (a == null) {
            a = a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsWQMVganbo0pWV7/vszrWJpbUAOGMqqe3j7bF1b8RJNNqn86fAZK1fvMdv4makm7KUQNvqsXj0+alVydenvVm5UQVyb/jmH0NawH/MiaQJX49gVQyFYShjGYRyjcjymaGKGCLZyjENVyt3ahlQFTcvLvBwZ4Q7jt1YXzqvI8klkm87MdUahLdAVHxrwAXYdiUS0sC8/CtkGH7SEocKzvTUttimgzxZ/UMcxra3kRtiDaDgDqOPLnKYhRgCl0syrhODQ132QskuTK9061Re87FGF2c/b+joSVWPASG6pCbijYx3syKDGjOXKjR2G6oO7TQ5TAEFzsLMKRc6X29fD2jwIDAQAB");
        }
        return a;
    }
}
