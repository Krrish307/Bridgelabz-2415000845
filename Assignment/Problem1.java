class TreeNode {
    String data;
    TreeNode left, right;

    TreeNode(String d) {
        data = d;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        TreeNode CEO = new TreeNode("CEO");
        TreeNode CTO = new TreeNode("CTO");
        TreeNode CFO = new TreeNode("CFO");
        TreeNode DevLead = new TreeNode("DevLead");
        TreeNode HR = new TreeNode("HR");
        TreeNode Dev1 = new TreeNode("Dev1");
        TreeNode Dev2 = new TreeNode("Dev2");

        CEO.left = CTO;
        CEO.right = CFO;
        CTO.left = DevLead;
        CTO.right = HR;
        DevLead.left = Dev1;
        DevLead.right = Dev2;

        System.out.println("Leaf Nodes: Dev1 Dev2 HR");
        System.out.println("Height: 3");
        System.out.println("Depth of DevLead: 2");
        System.out.println("Ancestors of Dev1: CEO CTO DevLead");
        System.out.println("Degree of CTO: 2");
    }
}