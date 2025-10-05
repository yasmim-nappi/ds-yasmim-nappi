package service;
@Service
public class ProdutoService {

    @AutoWired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }
    public List<Produto> listarTodos() {
        return repository.findAll();
    }
    public Optional<Produto> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar (Long id) {
        repository.deleteById(id);
    }
}
