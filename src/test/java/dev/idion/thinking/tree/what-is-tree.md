# Tree 자료구조

**학습목표**

- 이진 트리가 무엇인지 학습한다.
- 이진 검색트리가 무엇인지 학습한다.
- 트리의 순회에 대해 학습한다.
- 힙이 무엇인지와 힙 정렬에 대해 학습한다.

## Tree 자료구조란 무엇인가?

Tree 구조는 Node로 이루어진 자료구조 입니다.

1. Tree는 하나의 root node를 가집니다.
2. 각 Node는 0개 이상의 child node를 가집니다.
3. child node는 parent node로의 연결을 가질 수도 있고, 가지지 않을 수도 있습니다.
4. 비선형 구조로 계층적 관계를 표현합니다.

### [트리(Tree)와 관련된 용어](https://gmlwjd9405.github.io/2018/08/12/data-structure-tree.html)

![img](https://gmlwjd9405.github.io/images/data-structure-tree/tree-terms.png)

- 루트 노드(root node): 부모가 없는 노드, 트리는 하나의 루트 노드만을 가진다.
- 단말 노드(leaf node): 자식이 없는 노드, ‘말단 노드’ 또는 ‘잎 노드’라고도 부른다.
- 내부(internal) 노드: 단말 노드가 아닌 노드
- 간선(edge): 노드를 연결하는 선 (link, branch 라고도 부름)
- 형제(sibling): 같은 부모를 가지는 노드
- 노드의 크기(size): 자신을 포함한 모든 자손 노드의 개수
- 노드의 깊이(depth): 루트에서 어떤 노드에 도달하기 위해 거쳐야 하는 간선의 수
- 노드의 레벨(level): 트리의 특정 깊이를 가지는 노드의 집합
- 노드의 차수(degree): 하위 트리 개수 / 간선 수 (degree) = 각 노드가 지닌 가지의 수
- 트리의 차수(degree of tree): 트리의 최대 차수
- 트리의 높이(height): 루트 노드에서 가장 깊숙히 있는 노드의 깊이

### 트리(Tree)의 특징

- 그래프의 한 종류이다. ‘최소 연결 트리’ 라고도 불린다.
- 트리는 계층 모델 이다.
- 트리는 DAG(Directed Acyclic Graphs, 방향성이 있는 비순환 그래프)의 한 종류이다.
  - loop나 circuit이 없다. 당연히 self-loop도 없다.
  - 즉, 사이클이 없다.
- 노드가 N개인 트리는 항상 N-1개의 간선(edge)을 가진다.
  - 즉, 간선은 항상 (정점의 개수 - 1) 만큼을 가진다.
- 루트에서 어떤 노드로 가는 경로는 유일하다.
  - 임의의 두 노드 간의 경로도 유일하다. 즉, 두 개의 정점 사이에 반드시 1개의 경로만을 가진다.
- 한 개의 루트 노드만이 존재하며 모든 자식 노드는 한 개의 부모 노드만을 가진다.
  - 부모-자식 관계이므로 흐름은 top-bottom 아니면 bottom-top으로 이루어진다.
- 순회는 Pre-order, In-order 아니면 Post-order로 이루어진다. 이 3가지 모두 DFS/BFS 안에 있다.
- 트리는 이진 트리, 이진 탐색 트리, 균형 트리(AVL 트리, red-black 트리), 이진 힙(최대힙, 최소힙) 등이 있다.

## Binary Tree가 무엇인가?

## Binary Search Tree가 무엇인가?

## 트리의 순회 방법에는 어떤 것들이 있는가?

### 전위 순회(preorder), 깊이 우선 순회(depth-first traversal)

### 중위 순회(inorder), 대칭 순회(symmetric)

### 후위 순회(postorder)

### 계층 순회, 레벨 순서 순회(level-order), 너비 우선 순회(breadth-first traversal)

## Heap이 무엇인가?

## HeapSort는 무엇인가?

## B-Tree는 무엇인가?

## Red-Black Tree는 무엇인가?