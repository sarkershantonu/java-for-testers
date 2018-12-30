package org.automation.rules;

import org.junit.AssumptionViolatedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class SystemPrintRule extends TestWatcher {
    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
        System.out.println("টেস্ট পাস হইছে >>"+description.getMethodName());
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        System.out.println("টেস্ট ফেল করছে << "+description.getClassName()
                +" : "+description.getMethodName());
    }


    @Override
    protected void starting(Description description) {
        System.out.println("টেস্ট সুরু হল >> ");
        super.starting(description);
    }

    @Override
    protected void finished(Description description) {
        System.out.println("টেস্ট শেষ >> ");
        super.finished(description);
    }
}
