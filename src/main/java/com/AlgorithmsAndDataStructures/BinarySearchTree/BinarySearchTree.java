package com.AlgorithmsAndDataStructures.BinarySearchTree;


/**
 * 二分搜索树
 * @author lubiao
 * @createDate 2018年08月08日 上午 09:24:00
 */
public class BinarySearchTree {

    private Node mRoot;

    private int mCount;

    public int getSize(){
        return mCount;
    }

    public boolean isEmpty(){
        return mCount == 0;
    }





    public void insert(int key, int value){
        mRoot = insert(mRoot, key, value);
    }

    public int search(int key){
        //调用内部函数递归的进行。
        return search(mRoot,key);
    }

    /**
     * 判断当前的key对应的键值对是否存在二叉搜索树中
     * @param key 要查找的key
     * @return 存在返回true,不存在返回false.
     */
    public boolean contain(int key){
        return contain(mRoot,key);
    }

    private Node insert(Node node, int key, int value){
        if (node == null){
            mCount++;
            return new Node(key, value);
        }
        if(key < node.getKey()){
            Node left = insert(node.getLeftChild(), key, value);
            node.setLeftChild(left);
        }
        else if(key > node.getKey()){
            Node right = insert(node.getRightChild(),key, value);
            node.setRightChild(right);
        }else{
            node.setValue(value);
        }
        return node;
    }

    private int search(Node node,int key){
        if(node == null){
            return (Integer)null;
        }
        if(node.getKey() == key){
            return node.getValue();
        }else if(key < node.getKey()){
            return search(node.getLeftChild(),key);
        }else{
            return search(node.getRightChild(),key);
        }
    }

    //实现思路和搜索一样，毕竟看看有没有在其实就是搜索的过程
    private boolean contain(Node node,int key){
        if(node==null){
            return false;
        }
        if(key == node.getKey()){
            return true;
            //看它这样子key是唯一并且右边的key也大于左边？
        }else if (key < node.getKey()){
            //左侧处理,继续处理左子节点的数,找到后就直接返回。(此处理解的还是不太好)
            return contain(node.getLeftChild(), key);
        }else{
            return contain(node.getRightChild(), key);
        }
    }

    /**
     * 前序遍历
     * 遍历这块就用递归的思想很容易实现，那么最小的规模就是对一个节点,函数应该带有参数Node.
     */
    public void perTravelsal(){
        //从根节点开始遍历
        perTravelsal(mRoot);
    }
    private void perTravelsal(Node node){
        //直到节点是null就不用再往下走了
        if(node != null){
            //对于每个节点都是先遍历当前节点.
            //遍历就进行简单的打印key值吧
            System.out.print(node.getKey()+" ");
            //然后就去递归执行左子树，注意不用判断是否有，因为进去后自会判断
            perTravelsal(node.getLeftChild());
            //递归执行右子树
            perTravelsal(node.getRightChild());
        }
    }

    /**
     * 中序遍历,中序遍历的一个应用就是遍历完毕后就是有序的。
     */
    public void inorTravelsal(){
        //调用内部的递归实现.
        inorTravelsal(mRoot);
    }
    //具体的递归实现
    private void inorTravelsal(Node node){

        if(node!=null){
            //先遍历左节点
            inorTravelsal(node.getLeftChild());
            //然后当前节点
            System.out.print(node.getKey()+" ");
            inorTravelsal(node.getRightChild());
        }
    }

    /**
     * 后序遍历
     */
    public void postTarvelsal(){
        //道理同前两个
        postTarvelsal(mRoot);
    }
    private void postTarvelsal(Node node){
        if(node!=null){
            //先遍历左节点
            postTarvelsal(node.getLeftChild());
            //然后右子节点
            postTarvelsal(node.getRightChild());
            //最后才是当前节点
            System.out.print(node.getKey()+" ");
        }
    }

    /**
     * 找到值最小的节点,此处返回的是找到的节点的key,毕竟用户传入的是key和value.
     * 找不到是返回null.
     * @return 值最小的节点对应的key.
     */
    public int getMinmum(){
        if(isEmpty())
            return (Integer) null;
        //递归调用内部的实现.
        Node min = getMinmum(mRoot);
        return min.getKey();
    }

    private Node getMinmum(Node node){
        /*//不用担心node为null，以为假如是root根节点那么根本进入不到这里,
        //假如不是根节点的时候，在left为null的时候我们直接返回了。
        Node left  = node.getLeftChild();
        if(left != null){
            //不为null的时候递归的进行处理.
            getMinmum(left);
        }else{
            //当前节点的左子节点为null,证明已经找到了最小值
            return node;
        }
        return node;*/
        //下面是大神的简洁代码！虽然意思一样
        Node left  = node.getLeftChild();
        if(left == null){
            return node;
        }
        //否则的话递归调用,去执行它的左子节点
        return getMinmum(left);
    }

    //获取最大值节点,和最小值节点一样,根据特性
    //找到右子树的最下层的子节点。
    /**
     *  获取值最大的节点
     * @return 值最大的节点对应的key.
     */
    public int getMammum(){
        if(isEmpty())
            return (Integer) null;
        Node max = getMammum(mRoot);
        return max.getKey();
    }
    private Node getMammum(Node node){

        Node right  = node.getRightChild();
        if(right == null){
            return node;
        }

        return getMammum(right);
    }

    /**
     * 从二叉树中给删除最小的节点
     *
     */
    public void removeMin(){
        /*//首先应该找到最小节点
        Node min = getMinmum(mRoot);
        if(min == null)
            return;
        //如果当前节点有右子节点，把这个节点放到最小节点的父节点的索引上
        if(min.getRightChild()!=null){
            //怎么得到最小节点的父节点那？此时节点我们又没有设置父节点的属性，那么就还需要一点点的查找。
            //这个方案不行。
        }*/
        //所以只能再进行搜索，然后搜索到的时候就删除
        //还需要查找,还是继续用递归比较好理解,下面调用内部的删除函数
        if(isEmpty()){
            return;
        }
        removeMin(mRoot);
    }
    /**
     *
     * @param node 一开始传入根节点,一次镜像操作，一值传入的是左子树上的节点，
     *             直到删除最小节点的时候把右子树的节点设置进来，返回给父节点。
     *             (其实理解的还不够好)
     *
     * @return 返回删除节点后新的二分搜索树的根,
    其实就是最开始传入的二叉树的节点的根.
     */
    private Node removeMin(Node node){

        Node left = node.getLeftChild();
        if(left == null){//证明找到了最小节点
            //开始进行删除工作,感觉java这啥也不用管啊，释放节点？,
            //应该先把右边的子节点拿到，无论有没有，没有就是拿到一个null嘛.
            Node right = node.getRightChild();
            node = null;//释放当前节点的内存
            mCount--;//节点数量--
            //注意此处的返回值不会影响最终函数的返回值，这块的返回值仅仅是走到最小节点的时候
            //把当前最小节点的右子树返回回去，然后配合(注意是在上一个函数调用中,也就是最小节点的父节点)下面
            //的setLeftChild来实现把这个右子树的节点设置到父节点的左子树的节点。
            return right;
        }
        //下面的递归，在没有到最小节点的时候会一直卡在此处注意不会走到return node,
        //卡在此处的时候然后一值传入的是当前节点的left节点,一直设置的也是left节点
        //直到进入到最小节点，返回最小节点的右子节点，然后一层层设置。最后返回的是根节点root.
        Node temp = removeMin(left);
        node.setLeftChild(temp);
        return node;
    }

    /**
     * 移除最大节点，道理同移除最小节点
     */
    public void removeMax(){
        if(isEmpty()){
            return;
        }
        removeMax(mRoot);
    }
    /**
     *
     * @param node 需要进行removeMax()函数操作的当前节点.
     * @return  返回的是移除的节点所在的二叉树的根节点，其实就是最开始传入的二叉树的节点的根.
     */
    private Node removeMax(Node node){
        //获取右子节点
        Node right = node.getRightChild();

        //等于null的时候证明找到了最大的
        if(right == null){
            //取出来它的左子节点，无论有没有
            Node left = node.getLeftChild();
            node = null;//删除当前节点
            mCount--;
            return left;//返回这个用于父节点设置右子节点
        }
        Node temp = removeMax(right);
        node.setRightChild(temp);
        return node;
    }

    /**
     *     删除任意节点:由Hibbard提出的一种方法，称为Hubbard Deletion
     *删除任意节点和删除最小、最大节点的区别就是,删除任意节点的时候有可能左右两个都有子节点。
     *首先我们不可以简单的把左子节点或者右子节点，直接放到当前删除的节点的位置，因为这样
     *很容易导致不满足二叉搜索树的特性,我们应该找到当前述的前驱或者后继放入当前位置,前驱：前面
     *一个比它小的元素;后继:后面一个比它打的元素。比如一种方法，我们找到它的右子节点中所有的节点
     *中的最小的节点,然后把这个最小的节点放入到删除的节点中，此时仍然满足二叉搜索树的特性,左子节点
     *都小于它，右子节点都大于它。还一种中类似的就是找左子树中所有节点的最大的节点.
     *在找到要删除的节点时候删除步骤:(只有左子节点或者只有右子节点的时候，使用以前的,确定左右都有节点的时候)
     *    1、找到右子节点的最小值,删除它。
     *    2、然后把这个删除的节点放到找到的这个节点位置。
     *      就是把找到的节点的右子节点和左子节点分别赋值给删除的这个节点.
     *    3、最后这个节点还应该赋值给删除的节点的父节点的正确的位置.
     *以上都是通过边查找边实现的，你不能直接调用接口找到要删除的节点,这样此处无法拿到
     *它的父节点无法关联.
     * @param key 要删除的节点的key,此处是由于我们设计key为int型
     *
     */
    public void remove(int key){
        //内部还是调用递归的思想来实现
        mRoot = remove(mRoot,key);
    }
    private Node remove(Node node,int key){
        //第一个加入的节点,调用内部remove()的时候依然传入的是root
        //如果是空节点证明找到了最下层没找到.
        if(node == null){
            return null;//直接返回空即可.
        }
        //注意是从根节点一边搜索的。
        //如果发现比右子节点大,那么继续去右子节点找
        if(key > node.getKey()){
            //应该递归的去右边,下面整体理解的不到位。
            Node right = node.getRightChild();
            //继续传入右节点，此时和前面一处最大/小的理解方式是一样的,
            //当没有走到底,的时候是在父节点层：一直把右边的子节点传入，然后
            //返回的值设置为当前有右子节点(因为这个函数返回的是当前节点，而我们传入的是右子节点)
            //此处一直在这循环递归直到：
            //    1、我们没有找到要删除的节点，那么最终会走到node == null的时候,也就是最后一层
            //      返回的是null赋值给父节点的right、然后依次往上层递归返回,直到最开始传入节点那一层.
            //      都是在设置它们的右子节点没什么毛病.(结合上左节点一个道理)
            //    2、当我们找到要删除的那个节点的时候，此处假设这个节点叫D.那么再最后一层就不会走到这这个判
            //      断,而会走到我们下面设计的相等时的判断中，在那个判断里面我们会返回找到的前驱或者后继,然后
            //      这个节点就会被挂载到它的父节点的right子节点下。这样完成整个二叉树的链接。
            Node temp = remove(right, key);
            node.setRightChild(temp);
            return node;//返回当前节点，此时是最开始传入的node。
        }else if(key < node.getKey()){
            //道理等同于上面
            Node left= node.getLeftChild();
            Node temp = remove(left, key);
            node.setLeftChild(left);
            return node;
        } else {//此时就是找到要删除的节点了。
            //还会有三种情况：
            //第一种：找到的节点没有左子节点,此时就类似于删除最小值
            //此时node就是代表要删除的节点
            if(node.getLeftChild() == null){
                //直接获取右节点，返回，让它们再去一层层赋值即可，不用管是否为null
                Node right = node.getRightChild();
                mCount--;
                node = null;
                return right;
            }
            //第二种：找到的节点没有右子节点，此时类似于删除最大值
            if(node.getRightChild() == null){
                //道理同上
                Node left = node.getLeftChild();
                mCount--;
                node = null;
                return left;
            }
            //第三种：当左右都有子节点的时候,此时就是我们的Hubbard deletion了.
            //此处我们用的找删除节点的后继，也就是右子树的最小值.
            //所以应该先找到右子树的最小节点,复用getMinmum(node),传入当前node的右子节点。
            Node min = getMinmum(node.getRightChild());
            //然后复用removeMin,去删除node,此时不要传入root节点，传入当前节点的右子节点，
            //这样就会去删除以当前节点右子节点为根的所有子树中最小的节点的值,返回传入的右子节点.
            //内部会将二叉树中的那个节点的索引置为null,但我们前面拿到新索引，也是指向那个地方的.
            Node rightRoot = removeMin(node.getRightChild());
            //正好把这个右子节的根基诶单点赋值给找到的min的右子节点
            min.setRightChild(rightRoot);
            //然后还需要把已删除的节点的左子节点连接到找到的节点的左子节点。
            //此时node就是要删除的节点
            min.setLeftChild(node.getLeftChild());
            node = null;
            //mCount--;
            //此时感觉会多减一个啊，在前面remove的时候减了找的那个最小的，那此时又减去当前节点
            //但是把找到的最小的节点连接到二叉搜所树中的时候没有mCount++;
            //mCount++;//索性就不--了呗。

            return min;//返回用于最前面的判断key的那两个左右子节点的判断。
        }
    }

    /**
     * 根据传入的节点的key,来获得对应的floor操作后的节点的key
     *
     * @param key 要进行floor操作的节点的key
     * @return  对应的floor的结果节点的key,如果不存在返回null.
     */
    public int floor(int key){

        //如果二叉树中的mCount为0，或者小于最下值，那么没有前驱
        if(mCount==0||key < getMinmum()){
            return (Integer) null;
        }
        //调用内部实现的floor.
        Node node = floor(mRoot, key);
        return node.getKey();
    }
    // 在以node为根的二叉搜索树中, 寻找key的floor值所处的节点.
    private Node floor(Node node, int key){
        //当前节点为null的时候直接返回null.
        if( node == null )
            return null;
        // 如果node的key值和要寻找的key值相等,则node本身就是key的floor节点
        if( node.getKey() == key )
            return node;
        // 如果当前node的key值比要寻找的key值大,那么就说明前驱一定是在左节点当中。
        if( node.getKey() > key )
            //去左节点进行递归查找
            return floor( node.getLeftChild() , key );
        // 走到此处的时候就是当前节点的key小于要查找的key.此时两种情况：
        //    1)、此时这个node就是key节点对应的floor
        //    2)、此时的node不是key节点对应的floor,因为在当前node的右节点中有比这个节点的key小的值。
        //       也就是存在比node->key大但是小于key的其余节点.
        // 需要尝试向node的右子树寻找一下,总的来说理解的还是不深，但是整体感觉应该用递归的思想
        // 只考虑当前节点的情况，不要试图去一层又一层的往内部进去考虑,只考虑当前时，就是去右节点再递归找找
        // 如果找到了那么就返回它，如果没找到。证明当前节点(比key小)就是对的。那么就返回当前节点
        Node tempNode = floor( node.getRightChild() , key );
        //如果找到了证明存在比它小的直接返回小的
        if( tempNode != null )
            return tempNode;
        //走到此处的时候组恒明满足node.getKey() < key,并且在这个节点的右子树中不存在更小的了！
        return node;
    }

    public int ceil(int key){
        //如果二叉树中的mCount为0，或者小于最下值，那么没有前驱
        if(mCount==0||key > getMammum()){
            return (Integer) null;
        }
        //调用内部实现的floor.
        Node node = ceil(mRoot, key);
        return node.getKey();
    }
    private Node ceil(Node node ,int key){
        //当前节点为null的时候直接返回null.
        if(node == null){
            return null;
        }

        if(key == node.getKey()){
            return node;
        }
        //当key大于当前节点的key的时候,说明应该去右子树查找,找大于key的最小值
        //你不能小于key啊.
        if(key > node.getKey()){
            return ceil(node.getRightChild(), key);
        }
        //看看左节点有没有大于key但小于当前节点的key的
        Node tempNode = ceil( node.getLeftChild() , key );
        if( tempNode != null )
            return tempNode;//如果有返回这个
        //否则返回当前节点.
        return node;

    }

}

