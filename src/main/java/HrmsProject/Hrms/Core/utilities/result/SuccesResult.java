package HrmsProject.Hrms.Core.utilities.result;

public class SuccesResult extends  Result{

    public SuccesResult() {
        super(true);
    }

    public SuccesResult(String message) {
        super(true, message);
    }
}
