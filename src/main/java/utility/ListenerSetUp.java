package utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import testbase.TestBase;

public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(result.getName()+" TestCase Started ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName()+" TestCase Completed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info(result.getName()+" TestCase Failed ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(result.getName()+" TestCase Skipped");
	}

	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

