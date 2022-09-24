public class LinkedList<T>
    {
        protected LLNode<T> list;

        public LinkedList()
        {
            list = null;
        }

        public void addFirst(T info)
        {
            LLNode<T> node = new LLNode<T>(info);
            node.setLink(list);
            list = node;
        }

        public void addLast(T info)
        {
            LLNode<T> ak = list;

            LLNode<T> newNode = new LLNode<T>(info);
            if(ak == null)
            {
                list = newNode;
            }
            else
            {
                while(ak.getLink() != null)
                {
                    ak = ak.getLink();
                }
                ak.setLink(newNode);
            }
        }

        public void add(T afterThis, T info)
        {
            LLNode<T> ak = list;
            LLNode<T> addNode = new LLNode<T>(info);

            if(!contains(afterThis)) {
                addLast(info);
                return;
            }

            while (!ak.getInfo().equals(afterThis)) {
                ak = ak.getLink();
            }

            addNode.setLink(ak.getLink());
            ak.setLink(addNode);
            //TODO Complete this method as required in the homework instructions
        }

        public void removeFirst()
        {
            if (isEmpty()) {
                return;
            }

            LLNode<T> ak = list;
            list = ak.getLink();
            ak.setLink(null);
            //TODO Complete this method as required in the homework instructions
        }

        public void removeLast()
        {
            if (isEmpty()) {
                return;
            }
            LLNode<T> ak = list;

            if (size() == 1) {
                list = null;
                return;
            }

            while(ak.getLink().getLink() != null) {
                ak = ak.getLink();
            }
            ak.setLink(null);
            //TODO Complete this method as required in the homework instructions
        }

        public int size() {
            if (list == null) {
                return 0;
            }

            int size = 0;
            LLNode<T> ak = list;

            while (ak != null) {
                size++;
                ak = ak.getLink();
            }
            return size;
            //TODO Complete this method as required in the homework instructions
        }

        public boolean isEmpty()
        {
            return size() == 0;
            //TODO Complete this method as required in the homework instructions
        }

        public boolean contains(T item)
        {
            if(isEmpty()) {
                return false;
            }

            LLNode ak = list;
            while (ak != null) {
                if(ak.getInfo().equals(item)) {
                    return true;
                }
                ak = ak.getLink();
            }
            return false;
            //TODO Complete this method as required in the homework instructions

        }

        public void display()
        {
            LLNode<T> akNode = list;
            while(akNode != null)
            {
                System.out.println(akNode.getInfo());
                akNode = akNode.getLink();
            }
        }
    }

